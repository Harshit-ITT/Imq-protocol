package imq.protocol;

public class IMQResponse extends IMQProtocol {

	private int status;
	private ResponseMessage message;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public ResponseMessage getMessage() {
		return message;
	}

	public void setMessage(ResponseMessage message) {
		this.message = message;
	}

}
