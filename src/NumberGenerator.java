public class NumberGenerator implements Runnable {
    private String name;
  public  NumberGenerator( String Name){
      name = Name;
  }
    @Override
    public void run() {
      try{
           for(int i =0;i<12;i++){
               System.out.println("Count number" +i);
               Thread.sleep(500);
           }
      }catch (InterruptedException e){
          System.out.println("No count");
      }

    }
}
