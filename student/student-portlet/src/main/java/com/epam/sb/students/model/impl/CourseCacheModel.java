package com.epam.sb.students.model.impl;

import com.epam.sb.students.model.Course;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Course in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Course
 * @generated
 */
public class CourseCacheModel implements CacheModel<Course>, Externalizable {
    public long courseId;
    public String courseName;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{courseId=");
        sb.append(courseId);
        sb.append(", courseName=");
        sb.append(courseName);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Course toEntityModel() {
        CourseImpl courseImpl = new CourseImpl();

        courseImpl.setCourseId(courseId);

        if (courseName == null) {
            courseImpl.setCourseName(StringPool.BLANK);
        } else {
            courseImpl.setCourseName(courseName);
        }

        courseImpl.resetOriginalValues();

        return courseImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        courseId = objectInput.readLong();
        courseName = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(courseId);

        if (courseName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(courseName);
        }
    }
}
