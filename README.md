- [java-container-example](#java-container-example)
  * [Windows](#windows)
    + [WSL2 ](#wsl2)
    + [Docker ](#docker)
    + [Podman ](#podman)
  * [Linux](#linux)
    + [Docker ](#docker-1)
    + [Podman ](#podman-1)
  * [Validando a instalação](#validando-a-instalação)
    + [Docker](#docker-2)
    + [Podman](#podman-2)
  * [Container vs Maquina Virtual](#container-vs-maquina-virtual)
  * [O que é um container?](#o-que-é-um-container)

# java-container-example

## Windows

Requisitos:
  - WSL2
  - Docker ou podman (Escolha um dos dois)


### WSL2 
  - [Instalar o Linux no Windows com o WSL](https://learn.microsoft.com/pt-br/windows/wsl/install)

### Docker 

(se voce optou pelo podman ignore esse passo)

  - [Youtube: Instalar Docker no Windows - Passo a Passo](https://www.youtube.com/watch?v=sYsIoWtS5LY)

### Podman 

(se voce optou pelo docker ignore esse passo)

  - [Instalando o podman (alternativa ao Docker Desktop)](https://educoutinho.com.br/windows/instalando-podman-alternativa-docker-desktop/)


## Linux

Requisitos:
  - Docker ou podman

### Docker 

(se voce optou pelo podman ignore esse passo)

  - [Install Docker Engine](https://docs.docker.com/desktop/install/linux-install/)

or
  - [Install Docker Desktop on Linux](https://docs.docker.com/desktop/install/linux-install/)
### Podman 

(se voce optou pelo docker ignore esse passo)

  [Podman Installation Instructions - Installing on Linux ](https://podman.io/getting-started/installation.html#installing-on-linux)


## Validando a instalação

### Docker

(se voce optou pelo podman ignore esse passo)

```BASH
sudo docker run hello-world
```

Esta mensagem mostra que sua instalação parece estar funcionando corretamente

![docker-hello-world](./docs/imgs/docker-hello-world.png)

### Podman

(se voce optou pelo docker ignore esse passo)

```BASH
podman run hello-world
```

![podman-hello-world](./docs/imgs/podman-hello-world.png)

## Build e RUN

### Construindo a imagem a partir do Dockerfile
```BASH
# Se voce estiver usando docker
sudo docker build -t java-container-example:0.0.1 .

# Se voce estiver usando podman
podman build -t java-container-example:0.0.1 .
```

### Criando e rodando o container
```BASH
# Se voce estiver usando docker
sudo docker run --interactive java-container-example:0.0.1

# Se voce estiver usando podman
podman run --interactive java-container-example:0.0.1
```

## Container vs Maquina Virtual

[![containers-vs-virtual-machines](./docs/imgs/containers-vs-virtual-machines.jpg)](https://images.contentstack.io/v3/assets/blt300387d93dabf50e/bltb6200bc085503718/5e1f209a63d1b6503160c6d5/containers-vs-virtual-machines.jpg)


## O que é um container?

Containers são uma tecnologia que permite empacotar uma aplicação e todas as suas dependências em um pacote isolado e portátil. Isso significa que um container contém todos os arquivos, bibliotecas e outras dependências necessárias para que a aplicação funcione corretamente, independentemente do ambiente em que é executada.

Docker e Podman são duas ferramentas populares de gerenciamento de containers. Ambas permitem que você crie, execute e gerencie containers em um sistema operacional host.

Com Docker ou Podman, é possível criar um container contendo uma aplicação e todas as suas dependências em questão de minutos. Esse container pode ser implantado em qualquer sistema operacional que suporte containers, desde um laptop até um servidor em nuvem.

Os containers são muito úteis para desenvolvedores de software, pois permitem que eles criem e testem suas aplicações em um ambiente isolado e controlado, sem se preocupar com conflitos de dependências ou configurações de ambiente. Além disso, containers são muito eficientes em termos de recursos, o que significa que várias aplicações podem ser executadas em um único servidor sem afetar o desempenho.

Em resumo, os containers são uma tecnologia poderosa que facilita a implantação e o gerenciamento de aplicações em qualquer ambiente, e Docker e Podman são duas ferramentas populares para trabalhar com containers.