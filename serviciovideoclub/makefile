# #########################################################

# Compila clases  

# #########################################################

javacbanco:
	javac bancowebservice/*.java

# #########################################################

# Crea jar  

# #########################################################

jarbanco:
	jar cvf bancowebservice.jar bancowebservice/*.class

# #########################################################

# Instala servidor axis

# #########################################################

instalaservidorbanco:
	java -cp ../lib/axis-ant.jar:../lib/commons-logging-1.0.4.jar:../lib/axis.jar:../lib/jaxrpc.jar:../lib/saaj.jar:../lib/commons-discovery-0.2.jar:../lib/log4j-1.2.8.jar:../lib/wsdl4j-1.5.1.jar:../../mail.jar:../../activation.jar org.apache.axis.client.AdminClient -p 8888 banco.wsdd

# #########################################################

# Lanza servidor axis

# ########################################################

lanzarservidorbanco:
	java -cp ../lib/axis-ant.jar:../lib/commons-logging-1.0.4.jar:../lib/axis.jar:../lib/jaxrpc.jar:../lib/saaj.jar:../lib/commons-discovery-0.2.jar:../lib/log4j-1.2.8.jar:../lib/wsdl4j-1.5.1.jar:../../mail.jar:../../activation.jar:bancowebservice.jar: org.apache.axis.transport.http.SimpleAxisServer -p 8888

# #########################################################

# Crea clases a partir de wsdl

# ########################################################

wsdlbanco:
	java -cp ../lib/axis-ant.jar:../lib/commons-logging-1.0.4.jar:../lib/axis.jar:../lib/jaxrpc.jar:../lib/saaj.jar:../lib/commons-discovery-0.2.jar:../lib/log4j-1.2.8.jar:../lib/wsdl4j-1.5.1.jar:../../mail.jar:../../activation.jar  org.apache.axis.wsdl.WSDL2Java "http://localhost:8888/axis/services/Banco?wsdl"

# #########################################################

# Compila Banco 

# #########################################################

compbanco:
	javac -cp axis-1_4/lib/axis-ant.jar:axis-1_4/lib/commons-logging-1.0.4.jar:axis-1_4/lib/axis.jar:axis-1_4/lib/jaxrpc.jar:axis-1_4/lib/saaj.jar:axis-1_4/lib/commons-discovery-0.2.jar:axis-1_4/lib/log4j-1.2.8.jar:axis-1_4/lib/wsdl4j-1.5.1.jar:mail.jar:activation.jar:./ BancoClient.java

# #########################################################

# Compila Banco con clases generadas a partir del wsdl 

# #########################################################

compbanco2:
	javac -cp axis-1_4/lib/axis-ant.jar:axis-1_4/lib/commons-logging-1.0.4.jar:axis-1_4/lib/axis.jar:axis-1_4/lib/jaxrpc.jar:axis-1_4/lib/saaj.jar:axis-1_4/lib/commons-discovery-0.2.jar:axis-1_4/lib/log4j-1.2.8.jar:axis-1_4/lib/wsdl4j-1.5.1.jar:mail.jar:activation.jar:./ BancoClient2.java


# #########################################################

# Comandos banco

# #########################################################

exebancocrear:
	java -cp axis-1_4/lib/axis-ant.jar:axis-1_4/lib/commons-logging-1.0.4.jar:axis-1_4/lib/axis.jar:axis-1_4/lib/jaxrpc.jar:axis-1_4/lib/saaj.jar:axis-1_4/lib/commons-discovery-0.2.jar:axis-1_4/lib/log4j-1.2.8.jar:axis-1_4/lib/wsdl4j-1.5.1.jar:mail.jar:activation.jar:./ BancoClient crearCuenta Alfonso 32732479Y


exebancocrear2:
	java -cp axis-1_4/lib/axis-ant.jar:axis-1_4/lib/commons-logging-1.0.4.jar:axis-1_4/lib/axis.jar:axis-1_4/lib/jaxrpc.jar:axis-1_4/lib/saaj.jar:axis-1_4/lib/commons-discovery-0.2.jar:axis-1_4/lib/log4j-1.2.8.jar:axis-1_4/lib/wsdl4j-1.5.1.jar:mail.jar:activation.jar:./ BancoClient2 crearCuenta Alfonso 32732479Y

exebancoingresar:
	java -cp axis-1_4/lib/axis-ant.jar:axis-1_4/lib/commons-logging-1.0.4.jar:axis-1_4/lib/axis.jar:axis-1_4/lib/jaxrpc.jar:axis-1_4/lib/saaj.jar:axis-1_4/lib/commons-discovery-0.2.jar:axis-1_4/lib/log4j-1.2.8.jar:axis-1_4/lib/wsdl4j-1.5.1.jar:mail.jar:activation.jar:./ BancoClient ingresar 1234 200

exebancoingresar2:
	java -cp axis-1_4/lib/axis-ant.jar:axis-1_4/lib/commons-logging-1.0.4.jar:axis-1_4/lib/axis.jar:axis-1_4/lib/jaxrpc.jar:axis-1_4/lib/saaj.jar:axis-1_4/lib/commons-discovery-0.2.jar:axis-1_4/lib/log4j-1.2.8.jar:axis-1_4/lib/wsdl4j-1.5.1.jar:mail.jar:activation.jar:./ BancoClient2 ingresar 1234 200

exebancoretirar:
	java -cp axis-1_4/lib/axis-ant.jar:axis-1_4/lib/commons-logging-1.0.4.jar:axis-1_4/lib/axis.jar:axis-1_4/lib/jaxrpc.jar:axis-1_4/lib/saaj.jar:axis-1_4/lib/commons-discovery-0.2.jar:axis-1_4/lib/log4j-1.2.8.jar:axis-1_4/lib/wsdl4j-1.5.1.jar:mail.jar:activation.jar:./ BancoClient retirar 1234 40

exebancoretirar2:
	java -cp axis-1_4/lib/axis-ant.jar:axis-1_4/lib/commons-logging-1.0.4.jar:axis-1_4/lib/axis.jar:axis-1_4/lib/jaxrpc.jar:axis-1_4/lib/saaj.jar:axis-1_4/lib/commons-discovery-0.2.jar:axis-1_4/lib/log4j-1.2.8.jar:axis-1_4/lib/wsdl4j-1.5.1.jar:mail.jar:activation.jar:./ BancoClient2 retirar 1234 40
exebancocerrar:
	java -cp axis-1_4/lib/axis-ant.jar:axis-1_4/lib/commons-logging-1.0.4.jar:axis-1_4/lib/axis.jar:axis-1_4/lib/jaxrpc.jar:axis-1_4/lib/saaj.jar:axis-1_4/lib/commons-discovery-0.2.jar:axis-1_4/lib/log4j-1.2.8.jar:axis-1_4/lib/wsdl4j-1.5.1.jar:mail.jar:activation.jar:./ BancoClient cerrarCuenta 1234
exebancocerrar2:
	java -cp axis-1_4/lib/axis-ant.jar:axis-1_4/lib/commons-logging-1.0.4.jar:axis-1_4/lib/axis.jar:axis-1_4/lib/jaxrpc.jar:axis-1_4/lib/saaj.jar:axis-1_4/lib/commons-discovery-0.2.jar:axis-1_4/lib/log4j-1.2.8.jar:axis-1_4/lib/wsdl4j-1.5.1.jar:mail.jar:activation.jar:./ BancoClient2 cerrarCuenta 1234
exebancocuentas:
	java -cp axis-1_4/lib/axis-ant.jar:axis-1_4/lib/commons-logging-1.0.4.jar:axis-1_4/lib/axis.jar:axis-1_4/lib/jaxrpc.jar:axis-1_4/lib/saaj.jar:axis-1_4/lib/commons-discovery-0.2.jar:axis-1_4/lib/log4j-1.2.8.jar:axis-1_4/lib/wsdl4j-1.5.1.jar:mail.jar:activation.jar:./ BancoClient obtenercuentas 32732479Y
exebancocuentas2:
	java -cp axis-1_4/lib/axis-ant.jar:axis-1_4/lib/commons-logging-1.0.4.jar:axis-1_4/lib/axis.jar:axis-1_4/lib/jaxrpc.jar:axis-1_4/lib/saaj.jar:axis-1_4/lib/commons-discovery-0.2.jar:axis-1_4/lib/log4j-1.2.8.jar:axis-1_4/lib/wsdl4j-1.5.1.jar:mail.jar:activation.jar:./ BancoClient2 obtenercuentas 32732479Y
exebancotitular:
	java -cp axis-1_4/lib/axis-ant.jar:axis-1_4/lib/commons-logging-1.0.4.jar:axis-1_4/lib/axis.jar:axis-1_4/lib/jaxrpc.jar:axis-1_4/lib/saaj.jar:axis-1_4/lib/commons-discovery-0.2.jar:axis-1_4/lib/log4j-1.2.8.jar:axis-1_4/lib/wsdl4j-1.5.1.jar:mail.jar:activation.jar:./ BancoClient obtenertitular 1234
exebancotitular2:
	java -cp axis-1_4/lib/axis-ant.jar:axis-1_4/lib/commons-logging-1.0.4.jar:axis-1_4/lib/axis.jar:axis-1_4/lib/jaxrpc.jar:axis-1_4/lib/saaj.jar:axis-1_4/lib/commons-discovery-0.2.jar:axis-1_4/lib/log4j-1.2.8.jar:axis-1_4/lib/wsdl4j-1.5.1.jar:mail.jar:activation.jar:./ BancoClient2 obtenertitular 1234

