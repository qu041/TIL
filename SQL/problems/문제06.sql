-- ### group by ###################################


-- 1. tblZoo. 종류(family)별 평균 다리의 갯수를 가져오시오.
select family,round(avg(leg),1)
from tblzoo
group by family;


-- 2. traffic_accident. 각 교통 수단 별(지하철, 철도, 항공기, 선박, 자동차) 발생한 총 교통 사고 발생 수, 총 사망자 수, 사건 당 평균 사망자 수를 가져오시오.
select trans_type, sum(total_acct_num),sum(death_person_num),round(sum(death_person_num) / sum(total_acct_num),2)
from traffic_accident
group by trans_type;

select *
from traffic_accident;

    
-- 3. tblZoo. 체온이 변온인 종류 중 아가미 호흡과 폐 호흡을 하는 종들의 갯수를 가져오시오.
select *
from tblZoo;

select
    family,count(*)
from tblZoo
where  thermo = 'variable' and breath in ('gill','lung')
group by family;
        
        
-- 4. tblZoo. 사이즈와 종류별로 그룹을 나누고 각 그룹의 갯수를 가져오시오.
select
    sizeof,family,count(*)
from tblZoo
group by sizeof,family;

-- 5. tblAddressBook. 관리자의 실수로 몇몇 사람들의 이메일 주소가 중복되었다. 중복된 이메일 주소만 가져오시오.
select *
from tbladdressbook;

select email,count(*)
from tbladdressbook
group by email
having count(*) >=2;



-- 6. tblAddressBook. 성씨별 인원수가 100명 이상 되는 성씨들을 가져오시오.
select 
    substr(name,1,1)
    ,count(*)
from tbladdressbook
group by substr(name,1,1)
having count(*) >=100;


-- 7. tblAddressBook. '건물주'와 '건물주자제분'들의 거주지가 서울과 지방의 비율이 어떻게 되느냐?
select *
from tbladdressbook;

select case
        when hometown = '서울' then '서울'
        else '지방'
        end,
        count(*),
        ROUND((COUNT(*) * 100.0) / SUM(COUNT(*)) OVER (), 2) AS 비율,
        ROUND(COUNT(*) * 100.0 / (SELECT COUNT(*) FROM tblAddressBook WHERE job IN ('건물주', '건물주자제분')), 2) AS 비율2 --서브쿼리
        
from tbladdressbook
where job in ('건물주', '건물주자제분')
group by case
        when hometown = '서울' then '서울'
        else '지방'
        end;



