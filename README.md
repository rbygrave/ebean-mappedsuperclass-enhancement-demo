# ebean-mappedsuperclass-enhancement-demo

Demonstrates that when an `@Entity` extending a `@MappedSuperclass` is enhanced, its `_ebean_props` field contains only the names of its own properties, and not those of its `@MappedSuperclass`.

The project contains two entity classes: a `@MappedSuperclass` called `Parent` with a persistent property defined on it, and an `@Entity` called `Child` which inherits from it.

1. Run the `compileJava` task with the provided Gradle wrapper
2. Note that `_ebean_props` in **Child.class** does not contain the property from **Parent.class**

