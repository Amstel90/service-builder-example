package com.epam.sb.students.service.base;

import com.epam.sb.students.service.CourseServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CourseServiceClpInvoker {
    private String _methodName26;
    private String[] _methodParameterTypes26;
    private String _methodName27;
    private String[] _methodParameterTypes27;

    public CourseServiceClpInvoker() {
        _methodName26 = "getBeanIdentifier";

        _methodParameterTypes26 = new String[] {  };

        _methodName27 = "setBeanIdentifier";

        _methodParameterTypes27 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName26.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes26, parameterTypes)) {
            return CourseServiceUtil.getBeanIdentifier();
        }

        if (_methodName27.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes27, parameterTypes)) {
            CourseServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
