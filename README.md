This project is made up of a number of modules. At the time of writing this, they are as follows:
1. shared-utils - Just a few utility functions thats shared across a few of the modules
2. downloader - Downloads the latest gamepack
3. gamepack-deobfuscator - Deobfuscates the gamepack downloaded in the previous step 
4. find-names - Runs a bunch of identifiers to identify classes, methods and fields
5. gamepack-renamer - Updates the JAR created in step 3 to use all of the names found in step 4 (all of the mappings are saved in names.json)
6. gamepack-injector - Updates the original vanilla gamepack to add getters/setters and make each class implement our interfaces, so that we can use interface based injection/accessing
7. loader - Loads the updated jar and runs it 


The loader module is the thing that actually starts up the client. You can modify it to run either the vanilla jar, the injected jar, the deobbed jar or the renamed jar.
The intention is for it to run the injected jar though.