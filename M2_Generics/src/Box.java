
public class Box<T, Q> {
	private T val;
	private Q key;
	
	
	public <P> boolean isNull(P val) {
		return (val == null);
	}

	public void setVal(T val) {
		if (!this.isNull(val)) {
			this.val = val;
		}
	}

	public Q getKey() {
		return key;
	}

	public void setKey(Q key) {
		if (!this.isNull(key)) {
			this.key = key;
		}
	}

	public T getValue() {
		return val;
	}
}
