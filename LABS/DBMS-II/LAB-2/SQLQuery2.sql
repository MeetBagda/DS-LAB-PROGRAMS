-- 1. Write a function to print "hello world"
create function printHW()
returns varchar(50)
as
begin
return 'Hello World'
end

-- select dbo.printHW();

-- 2. Write a function which returns addition of two numbers
create function sumFun(@a int,@b int)
returns int
as
begin declare @c int
	  set @c = @a+@b
return @c
end

-- 3. Write a function to print cube of given number.
create function cubeFun(@n int)
returns int
as
begin
return @n*@n*@n
end

-- 4. Write a function to check where given number is ODD or EVEN.
create function oddEven(@n int)
returns varchar(50)
as
begin declare @result varchar(10)
if(@n % 2 = 0) set @result = 'Even'
else set @result =  'Odd'
return @result
end

-- 5. Write a function to compare two integers and returns the comparison result. (Using Case statement)
create function comparison(@a int,@b int)
returns varchar(50)
as
begin
	declare @ans varchar(50)
	set @ans = case
				when @a > @b then CONCAT(@a,' is greater than ',@b)
				when @a < @b then CONCAT(@a,' is less than ',@b)
				else 'Both are equal'
				end
			return @ans
end
-- select dbo.comparison(5,2)


-- 6. Write a function to print number from 1 to N. (Using while loop)
create function print1ToN(@n int)
returns varchar(1000)
as
begin
	
	declare @result varchar(1000)
	set @result = ''
	declare @i int
	set @i = 1
	while(@i<=@n) 
		begin 
			set @result = CONCAT(@result,' ',@i)
			set @i += 1
		end
	return @result
end

select dbo.print1ToN(10)


-- 7. Write a function to print sum of even numbers between 1 to 20.
create function printSum1to20()
returns int
as
begin
	declare @sum int
	set @sum = 0

	declare @i int
	set @i = 1

	while(@i<=20) 
		begin 
			set @sum += @i
			set @i += 1
		end
	return @sum
end

select dbo.printSum1to20()


-- 8. Write a function to check weather given number is prime or not.
create function prime(@n int)
returns varchar(max)
as
begin
	declare @flag varchar(50)
	declare @i int
	set @i = 2

	while (@i<@n) 
		begin 
			if(@n % @i = 0) 
			set @flag = 'not prime'
			else 
			set @flag = 'prime'
			set @i+=1
		end
	return @flag
end

select dbo.prime(7)


-- 9. Write a function which accepts two parameters start date & end date, and returns a difference in days.

--10. Write a function which accepts year & month in integer and returns total days in given month & year
alter function totalDays(@year int,@month int)
returns int
as
begin
	
	declare @d datetime = concat(@year,'/',@month,'/','1')
	declare @r int
	set @r = day(eomonth( @d ))

return @r
end

select dbo.totalDays(2024,2)