package functions;

public class Function {
	
	int room;
	String nome;
	String email;
	
	
	
	public Function(int room, String nome, String email) {
		this.room = room;
		this.nome = nome;
		this.email = email;
	}



	public Function(int[] room2, String[] nome2, String[] email2) {
		// TODO Stub de construtor gerado automaticamente
	}



	public String toString() {
		return room +
				": " +
				nome +
				", " +
				email;
	}
	
	
}
