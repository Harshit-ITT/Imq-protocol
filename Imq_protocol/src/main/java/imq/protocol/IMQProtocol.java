package imq.protocol;

import imq.model.ClientDataDTO;

public class IMQProtocol {

	private ClientDataDTO data;
	private String version;
	private String sourceUri;
	private String destinationUri;
	private String dataFormat;

	public ClientDataDTO getData() {
		return data;
	}

	public void setData(ClientDataDTO data) {
		this.data = data;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getSourceUri() {
		return sourceUri;
	}

	public void setSourceUri(String sourceUri) {
		this.sourceUri = sourceUri;
	}

	public String getDestinationUri() {
		return destinationUri;
	}

	public void setDestinationUri(String destinationUri) {
		this.destinationUri = destinationUri;
	}

	public String getDataFormat() {
		return dataFormat;
	}

	public void setDataFormat(String dataFormat) {
		this.dataFormat = dataFormat;
	}

}
