# -*- mode: ruby -*-
# vi: set ft=ruby :

$install_deps = <<-'SHELL'
  sudo apt-get update -y
  sudo apt-get install -y openjdk-17-jdk
SHELL

Vagrant.configure("2") do |config|

  config.vm.box = "utm/ubuntu-24.04"

  config.vm.hostname = "ubuntu"

  # doesn't work for UTM machine
  config.vm.network "private_network", ip: "192.168.100.100", auto_config: false

  config.vm.provider "utm" do |u|
    u.name = "ubuntu"
    u.cpus = 2
    u.memory = 4096
    u.directory_share_mode = "webDAV"
  end

  config.vm.provision "shell", inline: $install_deps

  config.trigger.after :up do |trigger|
    trigger.info = "Launch app"
    trigger.run = { inline: "vagrant ssh -c 'ip a; git clone https://github.com/yoorita/vagrant-lykova.git; cd vagrant-lykova; ./gradlew bootRun'" }
  end
  
end