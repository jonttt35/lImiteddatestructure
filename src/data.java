public class data implements DataStructure{
    Object[] objects = new Object[100];
    int putLocation = 0;
    int getLocation = 0;

    // Methods
    public boolean put(Object obj) {
        objects[putLocation]= obj;
        putLocation = putLocation + 1;
        return true;
    }
    public Object get() {



        Object anObject = objects[getLocation];

        if (anObject == null) {
            return false;


        } else {
            getLocation = getLocation + 1;
            return anObject;
        }
    }
}
