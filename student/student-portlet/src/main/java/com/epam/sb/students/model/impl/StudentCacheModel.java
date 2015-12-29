package com.epam.sb.students.model.impl;

import com.epam.sb.students.model.Student;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Student in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Student
 * @generated
 */
public class StudentCacheModel implements CacheModel<Student>, Externalizable {
    public long studentId;
    public String studentName;
    public double grade;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{studentId=");
        sb.append(studentId);
        sb.append(", studentName=");
        sb.append(studentName);
        sb.append(", grade=");
        sb.append(grade);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Student toEntityModel() {
        StudentImpl studentImpl = new StudentImpl();

        studentImpl.setStudentId(studentId);

        if (studentName == null) {
            studentImpl.setStudentName(StringPool.BLANK);
        } else {
            studentImpl.setStudentName(studentName);
        }

        studentImpl.setGrade(grade);

        studentImpl.resetOriginalValues();

        return studentImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        studentId = objectInput.readLong();
        studentName = objectInput.readUTF();
        grade = objectInput.readDouble();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(studentId);

        if (studentName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(studentName);
        }

        objectOutput.writeDouble(grade);
    }
}
