import included.MyExtension

plugins {
    id("included.plugin")
}


myplugin {
    this as MyExtension
    this.value = "foobar"
}

@included.MyAnnotation
class Foo
