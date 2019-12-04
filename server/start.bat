@echo off
rmdir /S /Q logs
rmdir /S /Q world
rmdir /S /Q world_nether
rmdir /S /Q world_the_end
rmdir /S /Q cache
rmdir /S /Q plugins\CustomStructuresAPI
del banned-ips.json
del banned-players.json
del commands.yml
del bukkit.yml
del help.yml
del ops.json
del paper.yml
del permissions.yml
del spigot.yml
del usercache.json
del version_history.json
del wepif.yml
del whitelist.json
java -Xmx2G -jar Spigot-Paper.jar