package com.epam.sb.students.service.base;

import com.epam.sb.students.service.StudentServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class StudentServiceClpInvoker {
    private String _methodName26;
    private String[] _methodParameterTypes26;
    private String _methodName27;
    private String[] _methodParameterTypes27;

    public StudentServiceClpInvoker() {
        _methodName26 = "getBeanIdentifier";

        _methodParameterTypes26 = new String[] {  };

        _methodName27 = "setBeanIdentifier";

        _methodParameterTypes27 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName26.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes26, parameterTypes)) {
            return StudentServiceUtil.getBeanIdentifier();
        }

        if (_methodName27.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes27, parameterTypes)) {
            StudentServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
