package Q2;

public abstract class Department {
	
	private StringQueue queue = new StringQueue();
	
	public StringQueue getQueue() {
		return queue;
	}
	
	public void addMessage(String msg) {
		
		queue.enqueue(msg);
	}
	
	public String nextMessage() throws EmptyQueueException{
		if (queue.isEmpty()) throw new EmptyQueueException();
		return queue.dequeue();
	}
	
	abstract String getName();
	
	
	
}
