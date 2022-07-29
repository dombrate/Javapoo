package poo;

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Cachorro cachorro = new Cachorro();
	cachorro.setNome("Luiza");
	cachorro.setIdade(8);
	
	Cavalo cavalo = new Cavalo();
	cavalo.setNome("Brad");
	cavalo.setIdade(2);
	
	Preguiça preguica = new Preguiça();
	preguica.setNome("caludia");
	preguica.setIdade(11);
	
	System.out.println("O cachorro " + cachorro.getNome() + " de idade: " + cachorro.getIdade());
	cachorro.SomAnimal();
	cachorro.MovimentoAnimal();
	System.out.println();
	
	System.out.println("O cavalo " + cavalo.getNome() + " de idade: " + cavalo.getIdade());
	cavalo.SomAnimal();
	cavalo.MovimentoAnimal();
	System.out.println();
	
	System.out.println("A preguiça " + preguica.getNome() + " de idade: " + preguica.getIdade());
	preguica.SomAnimal();
	preguica.MovimentoAnimal();
}

}

