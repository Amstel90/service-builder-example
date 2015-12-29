create index IX_47E0434F on student_Course (uuid_);

create index IX_F1C47F19 on student_Student (studentName);
create index IX_AFB6CCF7 on student_Student (uuid_);

create index IX_79167A65 on student_Students_Courses (courseId);
create index IX_3C39A7EB on student_Students_Courses (studentId);