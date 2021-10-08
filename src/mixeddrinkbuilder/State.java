package mixeddrinkbuilder;

public interface State {
	public void pour();
	public void mix();
	public void stir();
	public void shake();
	public void reward();
}
