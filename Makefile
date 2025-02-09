.PHONY: compile test clean

compile:
	./build.sh

test: compile
	java -cp lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar:target/classes:target/test-classes org.junit.runner.JUnitCore PrincipleReminderTest

clean:
	rm -rf target/
	rm -rf lib/