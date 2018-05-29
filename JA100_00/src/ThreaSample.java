
public class ThreaSample implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub


	        System.out.println("Doing heavy processing - START "+Thread.currentThread().getName());
	        try {
	            Thread.sleep(1000);
	            //Get database connection, delete unused data from DB
	            doDBProcessing();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        System.out.println("Doing heavy processing - END "+Thread.currentThread().getName());
	    }

	    private void doDBProcessing() throws InterruptedException {
	        Thread.sleep(5000);
	    }

	}

