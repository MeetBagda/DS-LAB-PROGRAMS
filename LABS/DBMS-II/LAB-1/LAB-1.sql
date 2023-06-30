--1 Find all persons with their department name & code.
select person.personName, department.departmentCode, department.departmentName from person
left outer join department
on person.departmentId=department.departmentId

-- 2. Find person's name whose department located in C-Block.
select person.personName from person
inner join department
on person.departmentId = department.departmentId
where location = 'c-block'

-- 3. Retrieve person name, salary & department name who belongs to Jamnagar city.
select person.personName, person.salary, department.departmentName from person
inner join department
on person.departmentId = department.departmentId
where city = 'jamnagar'

-- 4. Retrieve person name, salary & department name who does not belongs to Rajkot city.
select person.personName, person.salary, department.departmentName from person
full outer join department
on person.departmentId = department.departmentId
where person.city <> 'rajkot'

-- 5. Find detail of all persons who belongs Computer department.
select * from person
full outer join department
on person.departmentId = department.departmentId
where department.departmentCode = 'ce'

-- 6. Find all persons who does not belongs to any department.
select * from person
full outer join department
on person.departmentId = department.departmentId
where person.departmentId is null

-- 7. Retrieve person’s name who joined Civil department after 1-Aug-2001.
select * from person
full outer join department
on person.departmentId = department.departmentId
where person.joiningDate > '2001-08-01'

-- 8. Display all the person's name with department whose joining dates difference with current date is more than 365 days.
select person.personName, department.departmentName from person
full outer join department
on person.departmentId = department.departmentId
where DATEDIFF(DAY, person.joiningDate,getdate()) > 365

-- 9. Find department wise person counts.
select department.departmentName, count(person.personName) as Persons from person
full outer join department
on person.departmentId = department.departmentId
group by department.departmentName

-- 10. Give department wise maximum & minimum salary with department name.
select department.departmentName, max(person.salary) [max] , min(person.salary) [min] from person
right outer join department
on person.departmentId = department.departmentId
group by department.departmentName


-- 11. Find city wise total, average, maximum and minimum salary.
select person.city, sum(person.salary)[total], AVG(person.salary)[avg] ,max(person.salary) [max] , min(person.salary) [min] from person
group by  person.city

-- 12. Find all departments whose total salary is exceeding 100000.
select department.departmentName, sum(person.salary) as sumSalary from person
right outer join department
on person.departmentId = department.departmentId
group by department.departmentName
having sum(person.salary) > 100000

-- 13. Find average salary of person who belongs to Ahmedabad city.
select avg(person.salary) [avg] from person
where person.city = 'ahmedabad'


-- 14. List all departments who have no person.
select department.departmentName from person
full outer join department
on person.departmentId = department.departmentId
where person.departmentId is null

-- 15. List out department names in which more than two persons are working.
select department.departmentName,count(person.departmentId)[persons] from person
full outer join department
on person.departmentId = department.departmentId
group by department.departmentName
having count(person.departmentId) > 2

-- 16. Produce Output Like: <PersonName> lives in <City> and works in <DepartmentName> Department. (In single column)
select CONCAT(person.personName, ' lives in ', person.city, ' and works in ', department.departmentName) as [output] from person
right outer join department
on person.departmentId = department.departmentId

-- 17. Produce Output Like: <PersonName> earns <Salary> from department <DepartmentName> monthly. (In single column)
select CONCAT(person.personName, ' earns ', person.salary, ' from department ', department.departmentName, ' monthly ') as [output] from person
right outer join department
on person.departmentId = department.departmentId

-- 18. Find city & department wise total, average & maximum salaries.
select person.city, department.departmentName,sum(person.salary)[total], AVG(person.salary)[avg] ,max(person.salary) [max] from person
full outer join department
on person.departmentId = department.departmentId
group by  person.city, department.departmentName

-- 19. Give 10% increment in Computer department employee’s salary. (Use Update)
UPDATE person
SET salary = salary * 1.1
FROM person
JOIN department ON person.departmentId = department.departmentId
WHERE department.departmentName = 'Computer';


