public class Downloader extends Thread {
    //if implements runnable
    // we cant use get name,so use Thread.currentRunningThread().getName();

    public void run(){
        download();
    }
    public void download() {
        for (int i = 0; i <= 100; i += 10) {
            System.out.println("From"+getName()+"Downloaded: " + i + "%");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException ex) {
//                System.err.println(ex.getMessage());
//            }
        }
        System.out.println("Download completed");
    }
}
