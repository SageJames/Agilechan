#!/bin/bash

# Create necessary directories
mkdir -p target/classes
mkdir -p target/test-classes

# Download JUnit dependencies if they don't exist
mkdir -p lib
if [ ! -f lib/junit-4.13.2.jar ]; then
    curl -L https://search.maven.org/remotecontent?filepath=junit/junit/4.13.2/junit-4.13.2.jar -o lib/junit-4.13.2.jar
fi
if [ ! -f lib/hamcrest-core-1.3.jar ]; then
    curl -L https://search.maven.org/remotecontent?filepath=org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar -o lib/hamcrest-core-1.3.jar
fi

# Compile main sources
javac -d target/classes src/main/java/*.java

# Compile tests
javac -cp lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar:target/classes -d target/test-classes src/test/java/*.java

# Show options menu
echo "Please select an option:"
echo "1. Run tests"
echo "2. Run application"
echo "3. Exit"
read -p "Enter your choice (1-3): " choice

case $choice in
    1)
        echo "Running tests..."
        java -cp lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar:target/classes:target/test-classes org.junit.runner.JUnitCore PrincipleReminderTest
        ;;
    2)
        echo "Running application..."
        java -cp target/classes Agilechan
        ;;
    3)
        echo "Exiting..."
        exit 0
        ;;
    *)
        echo "Invalid option. Please choose 1, 2, or 3."
        exit 1
        ;;
esac
