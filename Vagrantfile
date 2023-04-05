# -*- mode: ruby -*-
# vi: set ft=ruby :


Vagrant.configure("2") do |config|

    config.vm.box = "bento/ubuntu-20.04"
    config.vm.network "public_network"
    config.vm.synced_folder '.', '/vagrant', disabled: true
    # config.vm.network "public_network"
  
    config.vm.provision "ansible" do |ansible|
        ansible.verbose = "v"
        ansible.playbook = "playbook.yml"

    end
    
    config.vm.define :control do |control|
      control.vm.hostname = "control" 
      control.vm.provider "virtualbox" do |v|
        v.memory = 4096
        v.cpus = 4
      end
    end
  
    config.vm.define :vm1 do |vm1|
      vm1.vm.hostname = "vm1" 
      vm1.vm.provision :shell, inline: "echo vm1"

      vm1.vm.provider "virtualbox" do |v|
        v.memory = 1024
        v.cpus = 1
      end
    end
  
    config.vm.define :vm2 do |vm2|
      vm2.vm.hostname = "vm2" 
      vm2.vm.provision :shell, inline: "echo vm2"
      vm2.vm.provider "virtualbox" do |v|
        v.memory = 1024
        v.cpus = 1
      end
    end

  end

  