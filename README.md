This project is made up of a number of modules. At the time of writing this, they are as follows:
1. shared-utils - Just a few utility functions thats shared across a few of the modules
2. downloader - Downloads the latest gamepack
3. deobfuscator - Deobfuscates the gamepack downloaded in the previous step 
4. find-names - Runs a bunch of identifiers to identify classes, methods and fields
5. updater - Updates the JAR created in step 3 to use all of the names found in step 4 (all of the mappings are saved in names.json)
6. loader - Loads the updated jar and runs it 

To run this client, run the modules in the order listed above.
You dont need to run all of them every time. 
If a new client revision comes out, you'll have to run them all.
But otherwise just the loader is fine. Unless you've added new identifiers, then run steps 4-6.