public class Os {
	
	private String os;
	private int version;
	
	public Os(String os, int version) {
		super();
		this.os = os;
		this.version = version;
	}

	
	public String getOs() {
		return os;
	}

	
	public void setOs(String os) {
		this.os = os;
	}

	
	public int getVersion() {
		return version;
	}

	
	public void setVersion(int version) {
		this.version = version;
	}

	
	@Override
	public String toString() {
		return "OS [os=" + os + ", version=" + version + "]";
	}
	
}
