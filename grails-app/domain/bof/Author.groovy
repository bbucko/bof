package bof

class Author {

	String name
	String surname

	static hasMany = [books:Book]


	static constraints = {
	}
	
	String toString(){
		"${name} ${surname}"
	}
}
