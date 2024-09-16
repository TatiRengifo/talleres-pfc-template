package taller

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class TestMaximoLista extends AnyFunSuite {
  val objMaximoList = new MaximoLista()

    test("MaximoLista = 5") {
        assert(objMaximoList.maxLin(List(5,5,5,5, 5)) == 5)
    }

    test("MaximoLista = 10") {
        assert(objMaximoList.maxLin(List(1, 2, 3, 4, 5, 5,10,10)) == 10)
    }
    
    test("MaximoLista = 15") {
        assert(objMaximoList.maxLin(List(15)) == 15)
    }

    test("Maximo Lista Vacia") {
        assertThrows[IllegalArgumentException] {
            objMaximoList.maxLin(List())
        }
    }
     test("MaximoLista RecursivaCola = 5") {
        assert(objMaximoList.maxIt(List(1,2,3,4,5)) == 5)
    }

    test("MaximoLista RecursivaCola = 10") {
        assert(objMaximoList.maxIt(List(1, 2, 3, 4, 5, 5,10,10)) == 10)
    }

    test("MaximoLista RecursivaCola = 12") {
        assert(objMaximoList.maxIt(List(12)) == 12)
    }

    test("Maximo Lista Vacia RecursivaCola") {
        assertThrows[IllegalArgumentException] {
            objMaximoList.maxIt(List())
        }
    }



    
}