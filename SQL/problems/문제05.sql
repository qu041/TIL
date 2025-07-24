-- ### decode ###################################


-- 1. tblInsa. 부장 몇명? 과장 몇명? 대리 몇명? 사원 몇명?
select
count(decode(jikwi,'부장','1')) as 부장,
count(decode(jikwi,'과장','1')) as 과장,
count(decode(jikwi,'대리','1')) as 대리,
count(decode(jikwi,'사원','1')) as 사원
from tblinsa;


-- 2. tblInsa. 간부(부장, 과장) 몇명? 사원(대리, 사원) 몇명?
select
count(decode(jikwi,'부장','1')) + count(decode(jikwi,'과장','1')) as 간부,
count(decode(jikwi,'대리','1')) + count(decode(jikwi,'사원','1')) as 평사원
from tblinsa;


-- 3. tblInsa. 기획부, 영업부, 총무부, 개발부의 각각 평균 급여?
desc tblinsa;
select
avg(decode(jikwi,jikwi = '기획부','1')) as 기획부,
avg(decode(jikwi,jikwi = '영업부','1')) as 영업부,
avg(decode(jikwi,jikwi = '총무부','1')) as 총무부,
avg(decode(basicpay,jikwi = '개발부','1')) as 개발부

from tblinsa;


-- 4. tblInsa. 남자 직원 가장 나이가 많은 사람이 몇년도 태생? 여자 직원 가장 나이가 어린 사람이 몇년도 태생?
SELECT
    

FROM tblinsa;


