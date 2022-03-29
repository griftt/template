package com.github.griftt.template.services

import com.intellij.openapi.project.Project
import com.github.griftt.template.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
