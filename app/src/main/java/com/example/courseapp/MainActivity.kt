package com.example.courseapp

import Course
import CourseListScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.courseapp.ui.theme.CourseAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val sampleCourses = listOf(
            Course(
                title = "Object-Oriented Programming",
                code = "SE201",
                creditHours = 3,
                description = "Covers the principles of object-oriented design and development using languages like Java or Kotlin.",
                prerequisites = listOf("CS101")
            ),
            Course(
                title = "Data Structures and Algorithms",
                code = "SE202",
                creditHours = 4,
                description = "Explores core data structures (lists, trees, graphs) and algorithms (sorting, searching) essential for software development.",
                prerequisites = listOf("SE201", "MATH101")
            ),
            Course(
                title = "Software Engineering Fundamentals",
                code = "SE203",
                creditHours = 3,
                description = "Introduces the software development lifecycle, agile methods, version control, and team collaboration tools.",
                prerequisites = listOf("SE201")
            ),
            Course(
                title = "Database Systems",
                code = "SE204",
                creditHours = 3,
                description = "Focuses on relational databases, SQL, ER modeling, and normalization for software projects.",
                prerequisites = listOf("SE201")
            ),
            Course(
                title = "Operating Systems",
                code = "SE205",
                creditHours = 4,
                description = "Examines the design and implementation of modern operating systems, including processes, memory, and file systems.",
                prerequisites = listOf("SE202")
            )
        )


        setContent {
            CourseAppTheme {
                CourseListScreen(courses = sampleCourses)
            }
        }
    }
}