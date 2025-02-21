# Vagrant

Write a Vagrant config in `Vagrantfile` to run a Java app in a Virtualbox VM.
* You should use `ubuntu/jammy64` box.
* Configure private networking with IP `192.168.100.100`.
* Configure Viartualbox with atleast `2` CPU and `4096 MB` Memory.
* Write an inline shell script in the `install_deps` variable. The script should install `openjdk-17-jdk` APT package.
* Run this script using `shell` provisioner.
* Configure a Vagrant trigger to execute after `vagrant up`. The trigger should execute an inline command to change into `/vagrant` folder and run `./gradlew bootRun`

If everything is ok, you should see a JSON list of dogs at [http://192.168.100.100:8080/dogs](http://192.168.100.100:8080/dogs)
