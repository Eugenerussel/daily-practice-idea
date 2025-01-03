//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // states of thread,
    //New
    // start() method takes to Runnable
    //Runnable
    //sleep(),wait(),suspend() method takes to blocked
    //Blocked
    //notify(),resume() completes thread sleep,and take to Runnable state
    // once the code inside Runnable is completed,the thread goes to Dead state.
    //Dead
    public static void main(String[] args) {
        //Downloader downloader1=new Downloader();
       // Downloader downloader2=new Downloader();


        //if Runnable is implemented,
//        Runnable runnable=new DownloaderWithRunnable();
//        Thread downloader1=new Thread(runnable);
//        Thread downloader2=new Thread(runnable);

         //IF THREAD IS EXTENDED{
//        Thread downloader1=new Downloader();
//        Thread downloader2=new Downloader();
//        downloader1.setName("Downloader 1");
//        downloader2.setName("Downloader 2"); OR

        //USING LAMBDA EXPRESSION
        Downloader task=new Downloader();
        Thread downloader1=new Thread(()->task.download());
        Thread downloader2=new Thread(()->task.download());
        //}



        //before,the thread executed in mixed way
        // now setting the priority,the max priority completes first then the min priority starts.
        downloader2.setPriority(Thread.MAX_PRIORITY);
        downloader1.setPriority(Thread.MIN_PRIORITY);
        //downloader1.download();
        //downloader2.download();
        //if void run method is implemented and the method is called inside it,use start().
        downloader1.start();
        downloader2.start();


    }
}