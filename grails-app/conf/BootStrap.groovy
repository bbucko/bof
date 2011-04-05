import bof.*

class BootStrap {

    def init = { servletContext ->
	def lem = new Author(name: "Stanislaw", surname: "Lem")
	lem.save()

	def cyberiada = new Book(title: "Cyberiada", author: lem)
	cyberiada.save()

	def asimov = new Author(name:"Isaac", surname: "Asimov")
	asimov.save()
	
	def foundation = new Book(title: "Foundation", author: asimov)
	foundation.save()


    }
    def destroy = {
    }
}
