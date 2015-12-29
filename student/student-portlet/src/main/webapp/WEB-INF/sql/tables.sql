create table student_Course (
	courseId LONG not null primary key,
	courseName VARCHAR(75) null
);

create table student_Student (
	studentId LONG not null primary key,
	studentName VARCHAR(75) null,
	grade DOUBLE
);

create table student_Students_Courses (
	courseId LONG not null,
	studentId LONG not null,
	primary key (courseId, studentId)
);