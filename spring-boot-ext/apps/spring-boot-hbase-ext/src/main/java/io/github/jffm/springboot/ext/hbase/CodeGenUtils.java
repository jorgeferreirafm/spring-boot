package io.github.jffm.springboot.ext.hbase;

import java.util.LinkedHashMap;
import java.util.Map;


public class CodeGenUtils {

	public static void main(String[] args) {
		
		String[] ls = new String[] {
				"dfs.client.read.shortcircuit",
				"dfs.domain.socket.path",
				"hadoop.policy.file",
				"hbase.auth.key.update.interval",
				"hbase.auth.token.max.lifetime",
				"hbase.balancer.period",
				"hbase.bucketcache.bucket.sizes",
				"hbase.bucketcache.combinedcache.enabled",
				"hbase.bucketcache.ioengine",
				"hbase.bucketcache.size",
				"hbase.bulkload.retries.number",
				"hbase.cells.scanned.per.heartbeat.check",
				"hbase.client.keyvalue.maxsize",
				"hbase.client.localityCheck.threadPoolSize",
				"hbase.client.max.perregion.tasks",
				"hbase.client.max.perserver.tasks",
				"hbase.client.max.total.tasks",
				"hbase.client.operation.timeout",
				"hbase.client.pause",
				"hbase.client.pause.cqtbe",
				"hbase.client.perserver.requests.threshold",
				"hbase.client.retries.number",
				"hbase.client.scanner.caching",
				"hbase.client.scanner.max.result.size",
				"hbase.client.scanner.timeout.period",
				"hbase.client.write.buffer",
				"hbase.cluster.distributed",
				"hbase.column.max.version",
				"hbase.coordinated.state.manager.class",
				"hbase.coprocessor.abortonerror",
				"hbase.coprocessor.enabled",
				"hbase.coprocessor.master.classes",
				"hbase.coprocessor.region.classes",
				"hbase.coprocessor.user.enabled",
				"hbase.data.umask",
				"hbase.data.umask.enable",
				"hbase.defaults.for.version",
				"hbase.defaults.for.version.skip",
				"hbase.dfs.client.read.shortcircuit.buffer.size",
				"hbase.display.keys",
				"hbase.dynamic.jars.dir",
				"hbase.fs.tmp.dir",
				"hbase.hregion.majorcompaction",
				"hbase.hregion.majorcompaction.jitter",
				"hbase.hregion.max.filesize",
				"hbase.hregion.memstore.block.multiplier",
				"hbase.hregion.memstore.flush.size",
				"hbase.hregion.memstore.mslab.enabled",
				"hbase.hregion.percolumnfamilyflush.size.lower.bound.min",
				"hbase.hregion.preclose.flush.size",
				"hbase.hstore.blockingStoreFiles",
				"hbase.hstore.blockingWaitTime",
				"hbase.hstore.bytes.per.checksum",
				"hbase.hstore.checksum.algorithm",
				"hbase.hstore.compaction.kv.max",
				"hbase.hstore.compaction.max",
				"hbase.hstore.compaction.max.size",
				"hbase.hstore.compaction.min",
				"hbase.hstore.compaction.min.size",
				"hbase.hstore.compaction.ratio",
				"hbase.hstore.compaction.ratio.offpeak",
				"hbase.hstore.compactionThreshold",
				"hbase.hstore.flusher.count",
				"hbase.hstore.time.to.purge.deletes",
				"hbase.http.filter.initializers",
				"hbase.http.max.threads",
				"hbase.http.staticuser.user",
				"hbase.ipc.client.fallback-to-simple-auth-allowed",
				"hbase.ipc.client.tcpnodelay",
				"hbase.ipc.server.callqueue.handler.factor",
				"hbase.ipc.server.callqueue.read.ratio",
				"hbase.ipc.server.callqueue.scan.ratio",
				"hbase.ipc.server.fallback-to-simple-auth-allowed",
				"hbase.lease.recovery.dfs.timeout",
				"hbase.lease.recovery.timeout",
				"hbase.local.dir",
				"hbase.master.balancer.maxRitPercent",
				"hbase.master.hfilecleaner.plugins",
				"hbase.master.info.bindAddress",
				"hbase.master.info.port",
				"hbase.master.infoserver.redirect",
				"hbase.master.kerberos.principal",
				"hbase.master.keytab.file",
				"hbase.master.loadbalancer.class",
				"hbase.master.logcleaner.plugins",
				"hbase.master.logcleaner.ttl",
				"hbase.master.mob.ttl.cleaner.period",
				"hbase.master.normalizer.class",
				"hbase.master.port",
				"hbase.mob.cache.evict.period",
				"hbase.mob.cache.evict.remain.ratio",
				"hbase.mob.compaction.batch.size",
				"hbase.mob.compaction.chore.period",
				"hbase.mob.compaction.mergeable.threshold",
				"hbase.mob.compaction.threads.max",
				"hbase.mob.compactor.class",
				"hbase.mob.delfile.max.count",
				"hbase.mob.file.cache.size",
				"hbase.normalizer.period",
				"hbase.offpeak.end.hour",
				"hbase.offpeak.start.hour",
				"hbase.procedure.master.classes",
				"hbase.procedure.regionserver.classes",
				"hbase.region.replica.replication.enabled",
				"hbase.regions.slop",
				"hbase.regionserver.checksum.verify",
				"hbase.regionserver.dns.interface",
				"hbase.regionserver.dns.nameserver",
				"hbase.regionserver.global.memstore.size",
				"hbase.regionserver.global.memstore.size.lower.limit",
				"hbase.regionserver.handler.abort.on.error.percent",
				"hbase.regionserver.handler.count",
				"hbase.regionserver.hlog.reader.impl",
				"hbase.regionserver.hlog.writer.impl",
				"hbase.regionserver.hostname",
				"hbase.regionserver.info.bindAddress",
				"hbase.regionserver.info.port",
				"hbase.regionserver.info.port.auto",
				"hbase.regionserver.kerberos.principal",
				"hbase.regionserver.keytab.file",
				"hbase.regionserver.logroll.errors.tolerated",
				"hbase.regionserver.logroll.period",
				"hbase.regionserver.majorcompaction.pagecache.drop",
				"hbase.regionserver.minorcompaction.pagecache.drop",
				"hbase.regionserver.msginterval",
				"hbase.regionserver.optionalcacheflushinterval",
				"hbase.regionserver.port",
				"hbase.regionserver.region.split.policy",
				"hbase.regionserver.regionSplitLimit",
				"hbase.regionserver.storefile.refresh.period",
				"hbase.regionserver.thread.compaction.throttle",
				"hbase.regionserver.thrift.compact",
				"hbase.regionserver.thrift.framed",
				"hbase.regionserver.thrift.framed.max_frame_size_in_mb",
				"hbase.replication.rpc.codec",
				"hbase.replication.source.maxthreads",
				"hbase.rest.csrf.enabled",
				"hbase.rest.filter.classes",
				"hbase.rest.port",
				"hbase.rest.readonly",
				"hbase.rest.support.proxyuser",
				"hbase.rest.threads.max",
				"hbase.rest.threads.min",
				"hbase.rest-csrf.browser-useragents-regex",
				"hbase.rootdir",
				"hbase.rootdir.perms",
				"hbase.rpc.shortoperation.timeout",
				"hbase.rpc.timeout",
				"hbase.rs.cacheblocksonwrite",
				"hbase.security.authentication",
				"hbase.security.exec.permission.checks",
				"hbase.security.visibility.mutations.checkauths",
				"hbase.serial.replication.waitingMs",
				"hbase.server.compactchecker.interval.multiplier",
				"hbase.server.keyvalue.maxsize",
				"hbase.server.scanner.max.result.size",
				"hbase.server.thread.wakefrequency",
				"hbase.server.versionfile.writeattempts",
				"hbase.snapshot.enabled",
				"hbase.snapshot.master.timeout.millis",
				"hbase.snapshot.region.timeout",
				"hbase.snapshot.restore.failsafe.name",
				"hbase.snapshot.restore.take.failsafe.snapshot",
				"hbase.status.listener.class",
				"hbase.status.multicast.address.ip",
				"hbase.status.multicast.address.port",
				"hbase.status.published",
				"hbase.status.publisher.class",
				"hbase.storescanner.parallel.seek.enable",
				"hbase.storescanner.parallel.seek.threads",
				"hbase.superuser",
				"hbase.table.lock.enable",
				"hbase.table.max.rowsize",
				"hbase.thrift.maxQueuedRequests",
				"hbase.thrift.maxWorkerThreads",
				"hbase.thrift.minWorkerThreads",
				"hbase.tmp.dir",
				"hbase.wal.dir.perms",
				"hbase.zookeeper.dns.interface",
				"hbase.zookeeper.dns.nameserver",
				"hbase.zookeeper.leaderport",
				"hbase.zookeeper.peerport",
				"hbase.zookeeper.property.clientPort",
				"hbase.zookeeper.property.dataDir",
				"hbase.zookeeper.property.initLimit",
				"hbase.zookeeper.property.maxClientCnxns",
				"hbase.zookeeper.property.syncLimit",
				"hbase.zookeeper.quorum",
				"hfile.block.bloom.cacheonwrite",
				"hfile.block.cache.size",
				"hfile.block.index.cacheonwrite",
				"hfile.format.version",
				"hfile.index.block.max.size",
				"io.storefile.bloom.block.size",
				"zookeeper.recovery.retry.maxsleeptime",
				"zookeeper.session.timeout",
				"zookeeper.znode.acl.parent",
				"zookeeper.znode.parent"
		};
		
		
		
		El rootEl = new El();
		
		for(String el : ls){
			String[] elsLs = el.split("\\.");
			El currentEl = rootEl;
			
			for(String subEl : elsLs){
				El child  = currentEl.getChild(subEl);
				if(child == null){
					child = new El();
					child.name = subEl;
					currentEl.addChild(child);
				}
				currentEl = child;
			}
		}
		
		StringBuilder  builder  = new StringBuilder();
		for(El child : rootEl.children.values()){
			createTemplate("\t", builder , child);
		}

		//System.out.println(builder);
		
		for(String el : ls){
			createTemplateCalls("\t", builder, el);
		}
		
		System.out.println(builder.toString());
		
	}
	
	public static void createTemplateCalls (String offset, StringBuilder builder, String name) {
		
		String[] elsLs = name.split("\\.");
		StringBuilder sb = new StringBuilder();
		for(String el : elsLs){
			String className = el.substring(0, 1).toUpperCase() + el.substring(1);
			sb.append(".get"+className+"()");
		}
		
		builder.append(offset+ "applyIfNotNull(configuration, HBaseProperties.PROP_" + name.replace(".", "_").toUpperCase() + ", hbaseProperties"+ sb.toString()+");\n"); 
	}
	
	public static void createTemplate (String offset, StringBuilder builder, El el) {
		if(el.children.isEmpty()){
			builder.append("\n" + offset + "@Getter @Setter  private String " + el.name + ";\n");
		}else{
			String className = el.name.substring(0, 1).toUpperCase() + el.name.substring(1);
			builder.append("\n" + offset + "public static class " + className + " {");
			for(El child : el.children.values()){
				
				createTemplate(offset+ "\t", builder, child);
				
			}
			builder.append("\n" + offset + "}");
			
			builder.append("\n" + offset + "@Getter @Setter private "+ className + " " + el.name + " = new " + className + "();\n");
			
		}
		
		
	}
	
	
	public static class El {
		
		private String name;
		
		private Map<String,El> children;
		
		public El() {
			this.children = new LinkedHashMap<>();
		}
		
		public void addChild(El child){
			this.children.put(child.name,child);
		}
		
		public El getChild(String name){
			return this.children.get(name);
		}
		
	}

}
