-- ### 정렬 ###################################


-- 1. employees. 전체 이름(first_name + last_name)이 가장 긴 -> 짧은 사람 순으로 정렬해서 가져오기
--    > 컬럼 리스트 > fullname(first_name + last_name), length(fullname)
select
    length(first_name || last_name) as length, first_name ||' '|| last_name as fullname
    
from
    employees
    order by length desc;
    


-- 2. employees. 전체 이름(first_name + last_name)이 가장 긴 사람은 몇글자? 가장 짧은 사람은 몇글자? 평균 몇글자?
--    > 컬럼 리스트 > 숫자 컬럼 3개

select
    max(length(first_name || last_name)) as 이름긴사람, min(length(first_name || last_name)) as 짧은사람, avg(length(first_name || last_name))
from
    employees;

    
    
    


-- 3. employees. last_name이 4자인 사람들의 first_name을 가져오기
--    > 컬럼 리스트 > first_name, last_name
--    > 정렬(first_name, 오름차순)
select
first_name,last_name
from employees
where last_name like '____'
order by first_name asc;



