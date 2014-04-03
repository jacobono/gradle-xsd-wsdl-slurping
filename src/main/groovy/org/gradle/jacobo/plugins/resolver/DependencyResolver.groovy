package org.gradle.jacobo.plugins.resolver

interface DependencyResolver {
  
  /**
   * Resolve dependencies of the document
   * @param document - document File to resolve
   * @return Set of files this document depends on
   */
  public Set<File> resolveDependencies(File document)
}