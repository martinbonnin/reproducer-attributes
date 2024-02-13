package included

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Some kdoc
 */
@MyAnnotation
class MyPlugin : Plugin<Project> {
  override fun apply(target: Project) {
    target.extensions.add("myplugin", MyExtension(""))
  }
}


class MyExtension(var value: String)
