#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public class ${NAME}{

    private ${NAME}() {
    }
    
    private static class SingletonHelper {
        private static final ${NAME} INSTANCE = new ${NAME}();
    }
    
    public static ${NAME} getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
