{ pkgs, ... }:
{
  # Specify the packages to install in the environment.
  packages = [
    pkgs.jdk17 # This installs OpenJDK 17
  ];

  # Optional: Set JAVA_HOME environment variable for convenience
  # This makes Java 17 the default for tools that rely on JAVA_HOME
  env = {
    JAVA_HOME = "${pkgs.jdk17}";
  };

  # Optional: Add any other required packages or extensions
  # idx.extensions = [
  #   "vscjava.vscode-java-pack" # Example: VS Code Java Extension Pack
  # ];

  # Optional: Define commands to run during workspace lifecycle hooks
  # onCreate = {
  #   commands = [
  #     "echo 'Workspace created with Java 17'"
  #   ];
  # };
}