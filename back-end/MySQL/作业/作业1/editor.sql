-- 3.查询student表的所有记录
SELECT * FROM student;

-- 4.查询student表的第2条到4条记录
SELECT * FROM student   LIMIT 1,3;

-- 5.从student表查询所有学生的学号（id）、姓名（name）和院系 （department）的信息
SELECT id,name,department FROM student;

-- 6.从student表中查询计算机系和英语系的学生的信息
SELECT * FROM student WHERE department='计算机系' or department='英语系';

-- 7.从student表中查询年龄18到22岁的学生信息
SELECT * FROM student WHERE DATE_FORMAT(NOW(),'%Y')-birth BETWEEN 18 AND 22;

-- 8.从student表中查询每个院系有多少人 
SELECT department,COUNT(*) FROM student GROUP BY department;

-- 9.从score表中查询每个科目的最高分
SELECT c_name,MAX(grade) FROM score GROUP BY c_name;

-- 10.查询李四的考试科目（c_name）和考试成绩（grade）
SELECT c_name,grade FROM student,score where student.id=score.stu_id and name='李四';

-- 11.用连接的方式查询所有学生的信息和考试信息
SELECT * FROM student,score where student.id=score.stu_id ;

-- 12.计算每个学生的总成绩
SELECT stu_id,SUM(grade) FROM score GROUP BY stu_id;

-- 13.计算每个考试科目的平均成绩
SELECT c_name,AVG(grade) FROM score GROUP BY c_name;

-- 14.查询计算机成绩低于95的学生信息
SELECT * FROM score where c_name='计算机' AND grade < 95;

-- 15.查询同时参加计算机和英语考试的学生的信息
SELECT * FROM student WHERE id IN (
	SELECT ta.stu_id FROM (
		SELECT stu_id FROM score WHERE c_name = '计算机'
	) 
	ta INNER JOIN (
		SELECT stu_id FROM score WHERE c_name = '英语'
	) 
	tb ON ta.stu_id = tb.stu_id
);

-- 16.将计算机考试成绩按从高到低进行排序
SELECT * FROM score where c_name='计算机' ORDER BY grade desc;

-- 17.从student表和score表中查询出学生的学号，然后合并查询结果
SELECT a.id,name,sex,birth,department,address,grade FROM student a,score b where a.id=b.stu_id;

-- 18.查询姓张或者姓王的同学的姓名、院系和考试科目及成绩
SELECT name,department,c_name,grade FROM student a,score b where a.id=b.stu_id 
and name in(SELECT name FROM student where  name LIKE '张%' OR name LIKE '王%');

-- 19.查询都是湖南的学生的姓名、年龄、院系和考试科目及成绩
SELECT name,DATE_FORMAT(NOW(),'%Y')-birth,department,c_name,grade FROM student,score 
where student.id=score.stu_id AND student.address LIKE '%湖南%';
