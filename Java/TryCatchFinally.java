class TryCatchFinally {
    public static void main(String[] args) {
        
        if(returnTest())
        {
            System.out.println("returnTest is True");
        } else {
            System.out.println("returnTest is False");
        }
    }

    static boolean returnTest() {
        try{
            return true;
        }catch(Exception e){
            return 0;
        }finally{
            return false;
        }
    }
}