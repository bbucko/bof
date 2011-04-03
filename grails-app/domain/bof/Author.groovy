package bof

class Author {

	String name
	String surname

	static hasMany = [books:Book]


	static constraints = {
	}
}
