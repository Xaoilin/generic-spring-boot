# CircleCI
This setup for circleci is intended to be used with the terraform module here: https://github.com/Xaoilin/generic-terraform. 

Steps for adding to CircleCI:
1. Add the private key you will ssh onto the server with in your circleci project settings as an `Additional SSH Key` with an empty `Hostname`.
2. This will then display the `fingerprint` of the ssh key which you then need to add in the circleci `config.yml`
3. Add the envrionment variables `DROPLET_USER` as `circleci` and `DROPLET_IP` as the IP address of your server. 
