package at.fh.swengb.collectionsandrecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val studentList = listOf<Student>(   Student("Markus", 3),
                                    Student("Julia", 2),
                                    Student("Michael",2))

        studentenListe.text= studentList[0].name

        val mutStudentList = mutableListOf<Student>(  Student("Markus", 3),
            Student("Julia", 2),
            Student("Michael",2),
            Student("Peter",4),
            Student("Lukas",1))

        mutStudentList.add(Student("Julian",4))

        mutStudentenListe.text = mutStudentList[5].name
        for (student in mutStudentList) {
            Log.i("mutSL", student.name )
        }

        val studentSet = setOf<Student>(    Student("Markus", 3),
            Student("Julia", 2),
            Student("Michael",2),
            Student("Peter",4),
            Student("Julia",2))

        for (student in studentSet) {
            Log.i("set", student.name)

        }

        val mutStudentSet = mutableSetOf<Student>(    Student("Markus", 3),
            Student("Julia", 2),
            Student("Michael",2),
            Student("Peter",4),
            Student("Rob",2))

        mutStudentSet.add(Student("Rob",2))
        mutStudentSet.add(Student("Lukas",1))

        for (student in mutStudentSet) {
            Log.i("mutset", student.name)
        }

        val ima18List = listOf(Student("Tyrion", 1), Student("Jon", 1))
        val ima17List = mutableListOf(Student("Sansa", 3), Student("Arya", 3), Student("Bran", 3))
        val studentMap = mapOf<String, List<Student>>("IMA18" to ima18List, "IMA17" to ima17List)

        for ((key, value) in studentMap){
            for(student in value) {
                Log.i("maps", student.name)
            }
        }

        val mutStudentMap = studentMap.toMutableMap()

        val ima16List = listOf(Student("HyperV", 6), Student("Thomas", 5))

        mutStudentMap.set("IMA16", ima16List)

        for ((key, value) in mutStudentMap){
            for(student in value) {
                Log.i("mutMaps", student.name)
            }
        }


    }
}
