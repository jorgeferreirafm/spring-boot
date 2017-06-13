package io.github.jffm.springboot.ext.hbase;


import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties(prefix="extension.datasources")
public class HBaseProperties {
	
	
	public static final String PROP_HADOOP_POLICY_FILE= "hadoop.policy.file";
	public static final String PROP_HBASE_TMP_DIR= "hbase.tmp.dir";
	public static final String PROP_HBASE_ROOTDIR= "hbase.rootdir";
	public static final String PROP_HBASE_FS_TMP_DIR= "hbase.fs.tmp.dir";
	public static final String PROP_HBASE_CLUSTER_DISTRIBUTED= "hbase.cluster.distributed";
	public static final String PROP_HBASE_ZOOKEEPER_QUORUM= "hbase.zookeeper.quorum";
	public static final String PROP_ZOOKEEPER_RECOVERY_RETRY_MAXSLEEPTIME= "zookeeper.recovery.retry.maxsleeptime";
	public static final String PROP_HBASE_LOCAL_DIR= "hbase.local.dir";
	public static final String PROP_HBASE_MASTER_PORT= "hbase.master.port";
	public static final String PROP_HBASE_MASTER_INFO_PORT= "hbase.master.info.port";
	public static final String PROP_HBASE_MASTER_INFO_BINDADDRESS= "hbase.master.info.bindAddress";
	public static final String PROP_HBASE_MASTER_LOGCLEANER_PLUGINS= "hbase.master.logcleaner.plugins";
	public static final String PROP_HBASE_MASTER_LOGCLEANER_TTL= "hbase.master.logcleaner.ttl";
	public static final String PROP_HBASE_MASTER_HFILECLEANER_PLUGINS= "hbase.master.hfilecleaner.plugins";
	public static final String PROP_HBASE_MASTER_INFOSERVER_REDIRECT= "hbase.master.infoserver.redirect";
	public static final String PROP_HBASE_REGIONSERVER_PORT= "hbase.regionserver.port";
	public static final String PROP_HBASE_REGIONSERVER_INFO_PORT= "hbase.regionserver.info.port";
	public static final String PROP_HBASE_REGIONSERVER_INFO_BINDADDRESS= "hbase.regionserver.info.bindAddress";
	public static final String PROP_HBASE_REGIONSERVER_INFO_PORT_AUTO= "hbase.regionserver.info.port.auto";
	public static final String PROP_HBASE_REGIONSERVER_HANDLER_COUNT= "hbase.regionserver.handler.count";
	public static final String PROP_HBASE_IPC_SERVER_CALLQUEUE_HANDLER_FACTOR= "hbase.ipc.server.callqueue.handler.factor";
	public static final String PROP_HBASE_IPC_SERVER_CALLQUEUE_READ_RATIO= "hbase.ipc.server.callqueue.read.ratio";
	public static final String PROP_HBASE_IPC_SERVER_CALLQUEUE_SCAN_RATIO= "hbase.ipc.server.callqueue.scan.ratio";
	public static final String PROP_HBASE_REGIONSERVER_MSGINTERVAL= "hbase.regionserver.msginterval";
	public static final String PROP_HBASE_REGIONSERVER_LOGROLL_PERIOD= "hbase.regionserver.logroll.period";
	public static final String PROP_HBASE_REGIONSERVER_LOGROLL_ERRORS_TOLERATED= "hbase.regionserver.logroll.errors.tolerated";
	public static final String PROP_HBASE_REGIONSERVER_HLOG_READER_IMPL= "hbase.regionserver.hlog.reader.impl";
	public static final String PROP_HBASE_REGIONSERVER_HLOG_WRITER_IMPL= "hbase.regionserver.hlog.writer.impl";
	public static final String PROP_HBASE_REGIONSERVER_GLOBAL_MEMSTORE_SIZE= "hbase.regionserver.global.memstore.size";
	public static final String PROP_HBASE_REGIONSERVER_GLOBAL_MEMSTORE_SIZE_LOWER_LIMIT= "hbase.regionserver.global.memstore.size.lower.limit";
	public static final String PROP_HBASE_REGIONSERVER_OPTIONALCACHEFLUSHINTERVAL= "hbase.regionserver.optionalcacheflushinterval";
	public static final String PROP_HBASE_REGIONSERVER_DNS_INTERFACE= "hbase.regionserver.dns.interface";
	public static final String PROP_HBASE_REGIONSERVER_DNS_NAMESERVER= "hbase.regionserver.dns.nameserver";
	public static final String PROP_HBASE_REGIONSERVER_REGION_SPLIT_POLICY= "hbase.regionserver.region.split.policy";
	public static final String PROP_HBASE_REGIONSERVER_REGIONSPLITLIMIT= "hbase.regionserver.regionSplitLimit";
	public static final String PROP_ZOOKEEPER_SESSION_TIMEOUT= "zookeeper.session.timeout";
	public static final String PROP_ZOOKEEPER_ZNODE_PARENT= "zookeeper.znode.parent";
	public static final String PROP_ZOOKEEPER_ZNODE_ACL_PARENT= "zookeeper.znode.acl.parent";
	public static final String PROP_HBASE_ZOOKEEPER_DNS_INTERFACE= "hbase.zookeeper.dns.interface";
	public static final String PROP_HBASE_ZOOKEEPER_DNS_NAMESERVER= "hbase.zookeeper.dns.nameserver";
	public static final String PROP_HBASE_ZOOKEEPER_PEERPORT= "hbase.zookeeper.peerport";
	public static final String PROP_HBASE_ZOOKEEPER_LEADERPORT= "hbase.zookeeper.leaderport";
	public static final String PROP_HBASE_ZOOKEEPER_PROPERTY_INITLIMIT= "hbase.zookeeper.property.initLimit";
	public static final String PROP_HBASE_ZOOKEEPER_PROPERTY_SYNCLIMIT= "hbase.zookeeper.property.syncLimit";
	public static final String PROP_HBASE_ZOOKEEPER_PROPERTY_DATADIR= "hbase.zookeeper.property.dataDir";
	public static final String PROP_HBASE_ZOOKEEPER_PROPERTY_CLIENTPORT= "hbase.zookeeper.property.clientPort";
	public static final String PROP_HBASE_ZOOKEEPER_PROPERTY_MAXCLIENTCNXNS= "hbase.zookeeper.property.maxClientCnxns";
	public static final String PROP_HBASE_CLIENT_WRITE_BUFFER= "hbase.client.write.buffer";
	public static final String PROP_HBASE_CLIENT_PAUSE= "hbase.client.pause";
	public static final String PROP_HBASE_CLIENT_PAUSE_CQTBE= "hbase.client.pause.cqtbe";
	public static final String PROP_HBASE_CLIENT_RETRIES_NUMBER= "hbase.client.retries.number";
	public static final String PROP_HBASE_CLIENT_MAX_TOTAL_TASKS= "hbase.client.max.total.tasks";
	public static final String PROP_HBASE_CLIENT_MAX_PERSERVER_TASKS= "hbase.client.max.perserver.tasks";
	public static final String PROP_HBASE_CLIENT_MAX_PERREGION_TASKS= "hbase.client.max.perregion.tasks";
	public static final String PROP_HBASE_CLIENT_PERSERVER_REQUESTS_THRESHOLD= "hbase.client.perserver.requests.threshold";
	public static final String PROP_HBASE_CLIENT_SCANNER_CACHING= "hbase.client.scanner.caching";
	public static final String PROP_HBASE_CLIENT_KEYVALUE_MAXSIZE= "hbase.client.keyvalue.maxsize";
	public static final String PROP_HBASE_SERVER_KEYVALUE_MAXSIZE= "hbase.server.keyvalue.maxsize";
	public static final String PROP_HBASE_CLIENT_SCANNER_TIMEOUT_PERIOD= "hbase.client.scanner.timeout.period";
	public static final String PROP_HBASE_CLIENT_LOCALITYCHECK_THREADPOOLSIZE= "hbase.client.localityCheck.threadPoolSize";
	public static final String PROP_HBASE_BULKLOAD_RETRIES_NUMBER= "hbase.bulkload.retries.number";
	public static final String PROP_HBASE_MASTER_BALANCER_MAXRITPERCENT= "hbase.master.balancer.maxRitPercent";
	public static final String PROP_HBASE_BALANCER_PERIOD= "hbase.balancer.period";
	public static final String PROP_HBASE_NORMALIZER_PERIOD= "hbase.normalizer.period";
	public static final String PROP_HBASE_REGIONS_SLOP= "hbase.regions.slop";
	public static final String PROP_HBASE_SERVER_THREAD_WAKEFREQUENCY= "hbase.server.thread.wakefrequency";
	public static final String PROP_HBASE_SERVER_VERSIONFILE_WRITEATTEMPTS= "hbase.server.versionfile.writeattempts";
	public static final String PROP_HBASE_HREGION_MEMSTORE_FLUSH_SIZE= "hbase.hregion.memstore.flush.size";
	public static final String PROP_HBASE_HREGION_PERCOLUMNFAMILYFLUSH_SIZE_LOWER_BOUND_MIN= "hbase.hregion.percolumnfamilyflush.size.lower.bound.min";
	public static final String PROP_HBASE_HREGION_PRECLOSE_FLUSH_SIZE= "hbase.hregion.preclose.flush.size";
	public static final String PROP_HBASE_HREGION_MEMSTORE_BLOCK_MULTIPLIER= "hbase.hregion.memstore.block.multiplier";
	public static final String PROP_HBASE_HREGION_MEMSTORE_MSLAB_ENABLED= "hbase.hregion.memstore.mslab.enabled";
	public static final String PROP_HBASE_HREGION_MAX_FILESIZE= "hbase.hregion.max.filesize";
	public static final String PROP_HBASE_HREGION_MAJORCOMPACTION= "hbase.hregion.majorcompaction";
	public static final String PROP_HBASE_HREGION_MAJORCOMPACTION_JITTER= "hbase.hregion.majorcompaction.jitter";
	public static final String PROP_HBASE_HSTORE_COMPACTIONTHRESHOLD= "hbase.hstore.compactionThreshold";
	public static final String PROP_HBASE_HSTORE_FLUSHER_COUNT= "hbase.hstore.flusher.count";
	public static final String PROP_HBASE_HSTORE_BLOCKINGSTOREFILES= "hbase.hstore.blockingStoreFiles";
	public static final String PROP_HBASE_HSTORE_BLOCKINGWAITTIME= "hbase.hstore.blockingWaitTime";
	public static final String PROP_HBASE_HSTORE_COMPACTION_MIN= "hbase.hstore.compaction.min";
	public static final String PROP_HBASE_HSTORE_COMPACTION_MAX= "hbase.hstore.compaction.max";
	public static final String PROP_HBASE_HSTORE_COMPACTION_MIN_SIZE= "hbase.hstore.compaction.min.size";
	public static final String PROP_HBASE_HSTORE_COMPACTION_MAX_SIZE= "hbase.hstore.compaction.max.size";
	public static final String PROP_HBASE_HSTORE_COMPACTION_RATIO= "hbase.hstore.compaction.ratio";
	public static final String PROP_HBASE_HSTORE_COMPACTION_RATIO_OFFPEAK= "hbase.hstore.compaction.ratio.offpeak";
	public static final String PROP_HBASE_HSTORE_TIME_TO_PURGE_DELETES= "hbase.hstore.time.to.purge.deletes";
	public static final String PROP_HBASE_OFFPEAK_START_HOUR= "hbase.offpeak.start.hour";
	public static final String PROP_HBASE_OFFPEAK_END_HOUR= "hbase.offpeak.end.hour";
	public static final String PROP_HBASE_REGIONSERVER_THREAD_COMPACTION_THROTTLE= "hbase.regionserver.thread.compaction.throttle";
	public static final String PROP_HBASE_REGIONSERVER_MAJORCOMPACTION_PAGECACHE_DROP= "hbase.regionserver.majorcompaction.pagecache.drop";
	public static final String PROP_HBASE_REGIONSERVER_MINORCOMPACTION_PAGECACHE_DROP= "hbase.regionserver.minorcompaction.pagecache.drop";
	public static final String PROP_HBASE_HSTORE_COMPACTION_KV_MAX= "hbase.hstore.compaction.kv.max";
	public static final String PROP_HBASE_STORESCANNER_PARALLEL_SEEK_ENABLE= "hbase.storescanner.parallel.seek.enable";
	public static final String PROP_HBASE_STORESCANNER_PARALLEL_SEEK_THREADS= "hbase.storescanner.parallel.seek.threads";
	public static final String PROP_HFILE_BLOCK_CACHE_SIZE= "hfile.block.cache.size";
	public static final String PROP_HFILE_BLOCK_INDEX_CACHEONWRITE= "hfile.block.index.cacheonwrite";
	public static final String PROP_HFILE_INDEX_BLOCK_MAX_SIZE= "hfile.index.block.max.size";
	public static final String PROP_HBASE_BUCKETCACHE_IOENGINE= "hbase.bucketcache.ioengine";
	public static final String PROP_HBASE_BUCKETCACHE_COMBINEDCACHE_ENABLED= "hbase.bucketcache.combinedcache.enabled";
	public static final String PROP_HBASE_BUCKETCACHE_SIZE= "hbase.bucketcache.size";
	public static final String PROP_HBASE_BUCKETCACHE_BUCKET_SIZES= "hbase.bucketcache.bucket.sizes";
	public static final String PROP_HFILE_FORMAT_VERSION= "hfile.format.version";
	public static final String PROP_HFILE_BLOCK_BLOOM_CACHEONWRITE= "hfile.block.bloom.cacheonwrite";
	public static final String PROP_IO_STOREFILE_BLOOM_BLOCK_SIZE= "io.storefile.bloom.block.size";
	public static final String PROP_HBASE_RS_CACHEBLOCKSONWRITE= "hbase.rs.cacheblocksonwrite";
	public static final String PROP_HBASE_RPC_TIMEOUT= "hbase.rpc.timeout";
	public static final String PROP_HBASE_CLIENT_OPERATION_TIMEOUT= "hbase.client.operation.timeout";
	public static final String PROP_HBASE_CELLS_SCANNED_PER_HEARTBEAT_CHECK= "hbase.cells.scanned.per.heartbeat.check";
	public static final String PROP_HBASE_RPC_SHORTOPERATION_TIMEOUT= "hbase.rpc.shortoperation.timeout";
	public static final String PROP_HBASE_IPC_CLIENT_TCPNODELAY= "hbase.ipc.client.tcpnodelay";
	public static final String PROP_HBASE_REGIONSERVER_HOSTNAME= "hbase.regionserver.hostname";
	public static final String PROP_HBASE_MASTER_KEYTAB_FILE= "hbase.master.keytab.file";
	public static final String PROP_HBASE_MASTER_KERBEROS_PRINCIPAL= "hbase.master.kerberos.principal";
	public static final String PROP_HBASE_REGIONSERVER_KEYTAB_FILE= "hbase.regionserver.keytab.file";
	public static final String PROP_HBASE_REGIONSERVER_KERBEROS_PRINCIPAL= "hbase.regionserver.kerberos.principal";
	public static final String PROP_HBASE_SUPERUSER= "hbase.superuser";
	public static final String PROP_HBASE_AUTH_KEY_UPDATE_INTERVAL= "hbase.auth.key.update.interval";
	public static final String PROP_HBASE_AUTH_TOKEN_MAX_LIFETIME= "hbase.auth.token.max.lifetime";
	public static final String PROP_HBASE_IPC_CLIENT_FALLBACK_TO_SIMPLE_AUTH_ALLOWED= "hbase.ipc.client.fallback-to-simple-auth-allowed";
	public static final String PROP_HBASE_IPC_SERVER_FALLBACK_TO_SIMPLE_AUTH_ALLOWED= "hbase.ipc.server.fallback-to-simple-auth-allowed";
	public static final String PROP_HBASE_DISPLAY_KEYS= "hbase.display.keys";
	public static final String PROP_HBASE_COPROCESSOR_ENABLED= "hbase.coprocessor.enabled";
	public static final String PROP_HBASE_COPROCESSOR_USER_ENABLED= "hbase.coprocessor.user.enabled";
	public static final String PROP_HBASE_COPROCESSOR_REGION_CLASSES= "hbase.coprocessor.region.classes";
	public static final String PROP_HBASE_REST_PORT= "hbase.rest.port";
	public static final String PROP_HBASE_REST_READONLY= "hbase.rest.readonly";
	public static final String PROP_HBASE_REST_THREADS_MAX= "hbase.rest.threads.max";
	public static final String PROP_HBASE_REST_THREADS_MIN= "hbase.rest.threads.min";
	public static final String PROP_HBASE_REST_SUPPORT_PROXYUSER= "hbase.rest.support.proxyuser";
	public static final String PROP_HBASE_DEFAULTS_FOR_VERSION= "hbase.defaults.for.version";
	public static final String PROP_HBASE_DEFAULTS_FOR_VERSION_SKIP= "hbase.defaults.for.version.skip";
	public static final String PROP_HBASE_COPROCESSOR_MASTER_CLASSES= "hbase.coprocessor.master.classes";
	public static final String PROP_HBASE_COPROCESSOR_ABORTONERROR= "hbase.coprocessor.abortonerror";
	public static final String PROP_HBASE_TABLE_LOCK_ENABLE= "hbase.table.lock.enable";
	public static final String PROP_HBASE_TABLE_MAX_ROWSIZE= "hbase.table.max.rowsize";
	public static final String PROP_HBASE_THRIFT_MINWORKERTHREADS= "hbase.thrift.minWorkerThreads";
	public static final String PROP_HBASE_THRIFT_MAXWORKERTHREADS= "hbase.thrift.maxWorkerThreads";
	public static final String PROP_HBASE_THRIFT_MAXQUEUEDREQUESTS= "hbase.thrift.maxQueuedRequests";
	public static final String PROP_HBASE_REGIONSERVER_THRIFT_FRAMED= "hbase.regionserver.thrift.framed";
	public static final String PROP_HBASE_REGIONSERVER_THRIFT_FRAMED_MAX_FRAME_SIZE_IN_MB= "hbase.regionserver.thrift.framed.max_frame_size_in_mb";
	public static final String PROP_HBASE_REGIONSERVER_THRIFT_COMPACT= "hbase.regionserver.thrift.compact";
	public static final String PROP_HBASE_ROOTDIR_PERMS= "hbase.rootdir.perms";
	public static final String PROP_HBASE_WAL_DIR_PERMS= "hbase.wal.dir.perms";
	public static final String PROP_HBASE_DATA_UMASK_ENABLE= "hbase.data.umask.enable";
	public static final String PROP_HBASE_DATA_UMASK= "hbase.data.umask";
	public static final String PROP_HBASE_SNAPSHOT_ENABLED= "hbase.snapshot.enabled";
	public static final String PROP_HBASE_SNAPSHOT_RESTORE_TAKE_FAILSAFE_SNAPSHOT= "hbase.snapshot.restore.take.failsafe.snapshot";
	public static final String PROP_HBASE_SNAPSHOT_RESTORE_FAILSAFE_NAME= "hbase.snapshot.restore.failsafe.name";
	public static final String PROP_HBASE_SERVER_COMPACTCHECKER_INTERVAL_MULTIPLIER= "hbase.server.compactchecker.interval.multiplier";
	public static final String PROP_HBASE_LEASE_RECOVERY_TIMEOUT= "hbase.lease.recovery.timeout";
	public static final String PROP_HBASE_LEASE_RECOVERY_DFS_TIMEOUT= "hbase.lease.recovery.dfs.timeout";
	public static final String PROP_HBASE_COLUMN_MAX_VERSION= "hbase.column.max.version";
	public static final String PROP_DFS_CLIENT_READ_SHORTCIRCUIT= "dfs.client.read.shortcircuit";
	public static final String PROP_DFS_DOMAIN_SOCKET_PATH= "dfs.domain.socket.path";
	public static final String PROP_HBASE_DFS_CLIENT_READ_SHORTCIRCUIT_BUFFER_SIZE= "hbase.dfs.client.read.shortcircuit.buffer.size";
	public static final String PROP_HBASE_REGIONSERVER_CHECKSUM_VERIFY= "hbase.regionserver.checksum.verify";
	public static final String PROP_HBASE_HSTORE_BYTES_PER_CHECKSUM= "hbase.hstore.bytes.per.checksum";
	public static final String PROP_HBASE_HSTORE_CHECKSUM_ALGORITHM= "hbase.hstore.checksum.algorithm";
	public static final String PROP_HBASE_CLIENT_SCANNER_MAX_RESULT_SIZE= "hbase.client.scanner.max.result.size";
	public static final String PROP_HBASE_SERVER_SCANNER_MAX_RESULT_SIZE= "hbase.server.scanner.max.result.size";
	public static final String PROP_HBASE_STATUS_PUBLISHED= "hbase.status.published";
	public static final String PROP_HBASE_STATUS_PUBLISHER_CLASS= "hbase.status.publisher.class";
	public static final String PROP_HBASE_STATUS_LISTENER_CLASS= "hbase.status.listener.class";
	public static final String PROP_HBASE_STATUS_MULTICAST_ADDRESS_IP= "hbase.status.multicast.address.ip";
	public static final String PROP_HBASE_STATUS_MULTICAST_ADDRESS_PORT= "hbase.status.multicast.address.port";
	public static final String PROP_HBASE_DYNAMIC_JARS_DIR= "hbase.dynamic.jars.dir";
	public static final String PROP_HBASE_SECURITY_AUTHENTICATION= "hbase.security.authentication";
	public static final String PROP_HBASE_REST_FILTER_CLASSES= "hbase.rest.filter.classes";
	public static final String PROP_HBASE_MASTER_LOADBALANCER_CLASS= "hbase.master.loadbalancer.class";
	public static final String PROP_HBASE_MASTER_NORMALIZER_CLASS= "hbase.master.normalizer.class";
	public static final String PROP_HBASE_REST_CSRF_ENABLED= "hbase.rest.csrf.enabled";
	public static final String PROP_HBASE_REST_CSRF_BROWSER_USERAGENTS_REGEX= "hbase.rest-csrf.browser-useragents-regex";
	public static final String PROP_HBASE_SECURITY_EXEC_PERMISSION_CHECKS= "hbase.security.exec.permission.checks";
	public static final String PROP_HBASE_PROCEDURE_REGIONSERVER_CLASSES= "hbase.procedure.regionserver.classes";
	public static final String PROP_HBASE_PROCEDURE_MASTER_CLASSES= "hbase.procedure.master.classes";
	public static final String PROP_HBASE_COORDINATED_STATE_MANAGER_CLASS= "hbase.coordinated.state.manager.class";
	public static final String PROP_HBASE_REGIONSERVER_STOREFILE_REFRESH_PERIOD= "hbase.regionserver.storefile.refresh.period";
	public static final String PROP_HBASE_REGION_REPLICA_REPLICATION_ENABLED= "hbase.region.replica.replication.enabled";
	public static final String PROP_HBASE_HTTP_FILTER_INITIALIZERS= "hbase.http.filter.initializers";
	public static final String PROP_HBASE_SECURITY_VISIBILITY_MUTATIONS_CHECKAUTHS= "hbase.security.visibility.mutations.checkauths";
	public static final String PROP_HBASE_HTTP_MAX_THREADS= "hbase.http.max.threads";
	public static final String PROP_HBASE_REPLICATION_RPC_CODEC= "hbase.replication.rpc.codec";
	public static final String PROP_HBASE_REPLICATION_SOURCE_MAXTHREADS= "hbase.replication.source.maxthreads";
	public static final String PROP_HBASE_SERIAL_REPLICATION_WAITINGMS= "hbase.serial.replication.waitingMs";
	public static final String PROP_HBASE_HTTP_STATICUSER_USER= "hbase.http.staticuser.user";
	public static final String PROP_HBASE_REGIONSERVER_HANDLER_ABORT_ON_ERROR_PERCENT= "hbase.regionserver.handler.abort.on.error.percent";
	public static final String PROP_HBASE_MOB_FILE_CACHE_SIZE= "hbase.mob.file.cache.size";
	public static final String PROP_HBASE_MOB_CACHE_EVICT_PERIOD= "hbase.mob.cache.evict.period";
	public static final String PROP_HBASE_MOB_CACHE_EVICT_REMAIN_RATIO= "hbase.mob.cache.evict.remain.ratio";
	public static final String PROP_HBASE_MASTER_MOB_TTL_CLEANER_PERIOD= "hbase.master.mob.ttl.cleaner.period";
	public static final String PROP_HBASE_MOB_COMPACTION_MERGEABLE_THRESHOLD= "hbase.mob.compaction.mergeable.threshold";
	public static final String PROP_HBASE_MOB_DELFILE_MAX_COUNT= "hbase.mob.delfile.max.count";
	public static final String PROP_HBASE_MOB_COMPACTION_BATCH_SIZE= "hbase.mob.compaction.batch.size";
	public static final String PROP_HBASE_MOB_COMPACTION_CHORE_PERIOD= "hbase.mob.compaction.chore.period";
	public static final String PROP_HBASE_MOB_COMPACTOR_CLASS= "hbase.mob.compactor.class";
	public static final String PROP_HBASE_MOB_COMPACTION_THREADS_MAX= "hbase.mob.compaction.threads.max";
	public static final String PROP_HBASE_SNAPSHOT_MASTER_TIMEOUT_MILLIS= "hbase.snapshot.master.timeout.millis";
	public static final String PROP_HBASE_SNAPSHOT_REGION_TIMEOUT= "hbase.snapshot.region.timeout";

	
	

	public static class Dfs {
		public static class Client {
			public static class Read {
				
				@Getter
				@Setter
				private String shortcircuit;

			}
			@Getter @Setter private Read read = new Read();

		}
		@Getter @Setter private Client client = new Client();

		public static class Domain {
			public static class Socket {
				@Getter @Setter  private String path;

			}
			@Getter @Setter private Socket socket = new Socket();

		}
		@Getter @Setter private Domain domain = new Domain();

	}
	@Getter @Setter private Dfs dfs = new Dfs();

	public static class Hadoop {
		public static class Policy {
			@Getter @Setter  private String file;

		}
		@Getter @Setter private Policy policy = new Policy();

	}
	@Getter @Setter private Hadoop hadoop = new Hadoop();

	public static class Hbase {
		public static class Auth {
			public static class Key {
				public static class Update {
					@Getter @Setter  private String interval;

				}
				@Getter @Setter private Update update = new Update();

			}
			@Getter @Setter private Key key = new Key();

			public static class Token {
				public static class Max {
					@Getter @Setter  private String lifetime;

				}
				@Getter @Setter private Max max = new Max();

			}
			@Getter @Setter private Token token = new Token();

		}
		@Getter @Setter private Auth auth = new Auth();

		public static class Balancer {
			@Getter @Setter  private String period;

		}
		@Getter @Setter private Balancer balancer = new Balancer();

		public static class Bucketcache {
			public static class Bucket {
				@Getter @Setter  private String sizes;

			}
			@Getter @Setter private Bucket bucket = new Bucket();

			public static class Combinedcache {
				@Getter @Setter  private String enabled;

			}
			@Getter @Setter private Combinedcache combinedcache = new Combinedcache();

			@Getter @Setter  private String ioengine;

			@Getter @Setter  private String size;

		}
		@Getter @Setter private Bucketcache bucketcache = new Bucketcache();

		public static class Bulkload {
			public static class Retries {
				@Getter @Setter  private String number;

			}
			@Getter @Setter private Retries retries = new Retries();

		}
		@Getter @Setter private Bulkload bulkload = new Bulkload();

		public static class Cells {
			public static class Scanned {
				public static class Per {
					public static class Heartbeat {
						@Getter @Setter  private String check;

					}
					@Getter @Setter private Heartbeat heartbeat = new Heartbeat();

				}
				@Getter @Setter private Per per = new Per();

			}
			@Getter @Setter private Scanned scanned = new Scanned();

		}
		@Getter @Setter private Cells cells = new Cells();

		public static class Client {
			public static class Keyvalue {
				@Getter @Setter  private String maxsize;

			}
			@Getter @Setter private Keyvalue keyvalue = new Keyvalue();

			public static class LocalityCheck {
				@Getter @Setter  private String threadPoolSize;

			}
			@Getter @Setter private LocalityCheck localityCheck = new LocalityCheck();

			public static class Max {
				public static class Perregion {
					@Getter @Setter  private String tasks;

				}
				@Getter @Setter private Perregion perregion = new Perregion();

				public static class Perserver {
					@Getter @Setter  private String tasks;

				}
				@Getter @Setter private Perserver perserver = new Perserver();

				public static class Total {
					@Getter @Setter  private String tasks;

				}
				@Getter @Setter private Total total = new Total();

			}
			@Getter @Setter private Max max = new Max();

			public static class Operation {
				@Getter @Setter  private String timeout;

			}
			@Getter @Setter private Operation operation = new Operation();

			public static class Pause {
				@Getter @Setter  private String cqtbe;

			}
			
			@Getter @Setter private Integer pause;
			
			@Getter @Setter private Pause _pause = new Pause();

			public static class Perserver {
				public static class Requests {
					@Getter @Setter  private String threshold;

				}
				@Getter @Setter private Requests requests = new Requests();

			}
			@Getter @Setter private Perserver perserver = new Perserver();

			public static class Retries {
				@Getter @Setter  private String number;

			}
			@Getter @Setter private Retries retries = new Retries();

			public static class Scanner {
				@Getter @Setter  private String caching;

				public static class Max {
					public static class Result {
						@Getter @Setter  private String size;

					}
					@Getter @Setter private Result result = new Result();

				}
				@Getter @Setter private Max max = new Max();

				public static class Timeout {
					@Getter @Setter  private String period;

				}
				@Getter @Setter private Timeout timeout = new Timeout();

			}
			@Getter @Setter private Scanner scanner = new Scanner();

			public static class Write {
				@Getter @Setter  private String buffer;

			}
			@Getter @Setter private Write write = new Write();

		}
		@Getter @Setter private Client client = new Client();

		public static class Cluster {
			@Getter @Setter  private Boolean distributed;

		}
		@Getter @Setter private Cluster cluster = new Cluster();

		public static class Column {
			public static class Max {
				@Getter @Setter  private String version;

			}
			@Getter @Setter private Max max = new Max();

		}
		@Getter @Setter private Column column = new Column();

		public static class Coordinated {
			public static class State {
				public static class Manager {
					//Reserved word - original name class
					@Getter @Setter  private String _class;

				}
				@Getter @Setter private Manager manager = new Manager();

			}
			@Getter @Setter private State state = new State();

		}
		@Getter @Setter private Coordinated coordinated = new Coordinated();

		public static class Coprocessor {
			@Getter @Setter  private String abortonerror;

			@Getter @Setter  private String enabled;

			public static class Master {
				@Getter @Setter  private String classes;

			}
			@Getter @Setter private Master master = new Master();

			public static class Region {
				@Getter @Setter  private String classes;

			}
			@Getter @Setter private Region region = new Region();

			public static class User {
				@Getter @Setter  private String enabled;

			}
			@Getter @Setter private User user = new User();

		}
		@Getter @Setter private Coprocessor coprocessor = new Coprocessor();

		public static class Data {
			public static class Umask {
				@Getter @Setter  private String enable;

			}
			@Getter @Setter private Umask umask = new Umask();

		}
		@Getter @Setter private Data data = new Data();

		public static class Defaults {
			public static class For {
				public static class Version {
					@Getter @Setter  private String skip;

				}
				@Getter @Setter private Version version = new Version();

			}
			//Reserved word - original name for
			@Getter @Setter private For _for = new For();

		}
		@Getter @Setter private Defaults defaults = new Defaults();

		public static class Dfs {
			public static class Client {
				public static class Read {
					public static class Shortcircuit {
						public static class Buffer {
							@Getter @Setter  private String size;

						}
						@Getter @Setter private Buffer buffer = new Buffer();

					}
					@Getter @Setter private Shortcircuit shortcircuit = new Shortcircuit();

				}
				@Getter @Setter private Read read = new Read();

			}
			@Getter @Setter private Client client = new Client();

		}
		@Getter @Setter private Dfs dfs = new Dfs();

		public static class Display {
			@Getter @Setter  private String keys;

		}
		@Getter @Setter private Display display = new Display();

		public static class Dynamic {
			public static class Jars {
				@Getter @Setter  private String dir;

			}
			@Getter @Setter private Jars jars = new Jars();

		}
		@Getter @Setter private Dynamic dynamic = new Dynamic();

		public static class Fs {
			public static class Tmp {
				@Getter @Setter  private String dir;

			}
			@Getter @Setter private Tmp tmp = new Tmp();

		}
		@Getter @Setter private Fs fs = new Fs();

		public static class Hregion {
			public static class Majorcompaction {
				@Getter @Setter  private String jitter;

			}
			@Getter @Setter private Majorcompaction majorcompaction = new Majorcompaction();

			public static class Max {
				@Getter @Setter  private String filesize;

			}
			@Getter @Setter private Max max = new Max();

			public static class Memstore {
				public static class Block {
					@Getter @Setter  private String multiplier;

				}
				@Getter @Setter private Block block = new Block();

				public static class Flush {
					@Getter @Setter  private String size;

				}
				@Getter @Setter private Flush flush = new Flush();

				public static class Mslab {
					@Getter @Setter  private String enabled;

				}
				@Getter @Setter private Mslab mslab = new Mslab();

			}
			@Getter @Setter private Memstore memstore = new Memstore();

			public static class Percolumnfamilyflush {
				public static class Size {
					public static class Lower {
						public static class Bound {
							@Getter @Setter  private String min;

						}
						@Getter @Setter private Bound bound = new Bound();

					}
					@Getter @Setter private Lower lower = new Lower();

				}
				@Getter @Setter private Size size = new Size();

			}
			@Getter @Setter private Percolumnfamilyflush percolumnfamilyflush = new Percolumnfamilyflush();

			public static class Preclose {
				public static class Flush {
					@Getter @Setter  private String size;

				}
				@Getter @Setter private Flush flush = new Flush();

			}
			@Getter @Setter private Preclose preclose = new Preclose();

		}
		@Getter @Setter private Hregion hregion = new Hregion();

		public static class Hstore {
			@Getter @Setter  private String blockingStoreFiles;

			@Getter @Setter  private String blockingWaitTime;

			public static class Bytes {
				public static class Per {
					@Getter @Setter  private String checksum;

				}
				@Getter @Setter private Per per = new Per();

			}
			@Getter @Setter private Bytes bytes = new Bytes();

			public static class Checksum {
				@Getter @Setter  private String algorithm;

			}
			@Getter @Setter private Checksum checksum = new Checksum();

			public static class Compaction {
				public static class Kv {
					@Getter @Setter  private String max;

				}
				@Getter @Setter private Kv kv = new Kv();

				public static class Max {
					@Getter @Setter  private String size;

				}
				@Getter @Setter private Max max = new Max();

				public static class Min {
					@Getter @Setter  private String size;

				}
				@Getter @Setter private Min min = new Min();

				public static class Ratio {
					@Getter @Setter  private String offpeak;

				}
				@Getter @Setter private Ratio ratio = new Ratio();

			}
			@Getter @Setter private Compaction compaction = new Compaction();

			@Getter @Setter  private String compactionThreshold;

			public static class Flusher {
				@Getter @Setter  private String count;

			}
			@Getter @Setter private Flusher flusher = new Flusher();

			public static class Time {
				public static class To {
					public static class Purge {
						@Getter @Setter  private String deletes;

					}
					@Getter @Setter private Purge purge = new Purge();

				}
				@Getter @Setter private To to = new To();

			}
			@Getter @Setter private Time time = new Time();

		}
		@Getter @Setter private Hstore hstore = new Hstore();

		public static class Http {
			public static class Filter {
				@Getter @Setter  private String initializers;

			}
			@Getter @Setter private Filter filter = new Filter();

			public static class Max {
				@Getter @Setter  private String threads;

			}
			@Getter @Setter private Max max = new Max();

			public static class Staticuser {
				@Getter @Setter  private String user;

			}
			@Getter @Setter private Staticuser staticuser = new Staticuser();

		}
		@Getter @Setter private Http http = new Http();

		public static class Ipc {
			public static class Client {
				//Invalid name - original name fallback-to-simple-auth-allowed
				@Getter @Setter  private String fallbackToSimpleAuthAllowed;

				@Getter @Setter  private String tcpnodelay;

			}
			@Getter @Setter private Client client = new Client();

			public static class Server {
				public static class Callqueue {
					public static class Handler {
						@Getter @Setter  private Float factor;

					}
					@Getter @Setter private Handler handler = new Handler();

					public static class Read {
						@Getter @Setter  private Float ratio;

					}
					@Getter @Setter private Read read = new Read();

					public static class Scan {
						@Getter @Setter  private Float ratio;

					}
					@Getter @Setter private Scan scan = new Scan();

				}
				@Getter @Setter private Callqueue callqueue = new Callqueue();

				//Invalid name - original name fallback-to-simple-auth-allowed
				@Getter @Setter  private String fallbackToSimpleAuthAllowed;

			}
			@Getter @Setter private Server server = new Server();

		}
		@Getter @Setter private Ipc ipc = new Ipc();

		public static class Lease {
			public static class Recovery {
				public static class Dfs {
					@Getter @Setter  private String timeout;

				}
				@Getter @Setter private Dfs dfs = new Dfs();

				@Getter @Setter  private String timeout;

			}
			@Getter @Setter private Recovery recovery = new Recovery();

		}
		@Getter @Setter private Lease lease = new Lease();

		public static class Local {
			@Getter @Setter  private String dir;

		}
		@Getter @Setter private Local local = new Local();

		public static class Master {
			public static class Balancer {
				@Getter @Setter  private String maxRitPercent;

			}
			@Getter @Setter private Balancer balancer = new Balancer();

			public static class Hfilecleaner {
				@Getter @Setter  private String plugins;

			}
			@Getter @Setter private Hfilecleaner hfilecleaner = new Hfilecleaner();

			public static class Info {
				@Getter @Setter  private String bindAddress;

				@Getter @Setter  private Integer port;

			}
			@Getter @Setter private Info info = new Info();

			public static class Infoserver {
				@Getter @Setter  private String redirect;

			}
			@Getter @Setter private Infoserver infoserver = new Infoserver();

			public static class Kerberos {
				@Getter @Setter  private String principal;

			}
			@Getter @Setter private Kerberos kerberos = new Kerberos();

			public static class Keytab {
				@Getter @Setter  private String file;

			}
			@Getter @Setter private Keytab keytab = new Keytab();

			public static class Loadbalancer {
				//Reserved name - original name class
				@Getter @Setter  private String _class;

			}
			@Getter @Setter private Loadbalancer loadbalancer = new Loadbalancer();

			public static class Logcleaner {
				@Getter @Setter  private String plugins;

				@Getter @Setter  private Integer ttl;

			}
			@Getter @Setter private Logcleaner logcleaner = new Logcleaner();

			public static class Mob {
				public static class Ttl {
					public static class Cleaner {
						@Getter @Setter  private String period;

					}
					@Getter @Setter private Cleaner cleaner = new Cleaner();

				}
				@Getter @Setter private Ttl ttl = new Ttl();

			}
			@Getter @Setter private Mob mob = new Mob();

			public static class Normalizer {
				//reserved name - original name class
				@Getter @Setter  private String _class;

			}
			@Getter @Setter private Normalizer normalizer = new Normalizer();

			@Getter @Setter  private Integer port;

		}
		@Getter @Setter private Master master = new Master();

		public static class Mob {
			public static class Cache {
				public static class Evict {
					@Getter @Setter  private String period;

					public static class Remain {
						@Getter @Setter  private String ratio;

					}
					@Getter @Setter private Remain remain = new Remain();

				}
				@Getter @Setter private Evict evict = new Evict();

			}
			@Getter @Setter private Cache cache = new Cache();

			public static class Compaction {
				public static class Batch {
					@Getter @Setter  private String size;

				}
				@Getter @Setter private Batch batch = new Batch();

				public static class Chore {
					@Getter @Setter  private String period;

				}
				@Getter @Setter private Chore chore = new Chore();

				public static class Mergeable {
					@Getter @Setter  private String threshold;

				}
				@Getter @Setter private Mergeable mergeable = new Mergeable();

				public static class Threads {
					@Getter @Setter  private String max;

				}
				@Getter @Setter private Threads threads = new Threads();

			}
			@Getter @Setter private Compaction compaction = new Compaction();

			public static class Compactor {
				//Reserved name - original name class
				@Getter @Setter  private String _class;

			}
			@Getter @Setter private Compactor compactor = new Compactor();

			public static class Delfile {
				public static class Max {
					@Getter @Setter  private String count;

				}
				@Getter @Setter private Max max = new Max();

			}
			@Getter @Setter private Delfile delfile = new Delfile();

			public static class File {
				public static class Cache {
					@Getter @Setter  private String size;

				}
				@Getter @Setter private Cache cache = new Cache();

			}
			@Getter @Setter private File file = new File();

		}
		@Getter @Setter private Mob mob = new Mob();

		public static class Normalizer {
			@Getter @Setter  private String period;

		}
		@Getter @Setter private Normalizer normalizer = new Normalizer();

		public static class Offpeak {
			public static class End {
				@Getter @Setter  private String hour;

			}
			@Getter @Setter private End end = new End();

			public static class Start {
				@Getter @Setter  private String hour;

			}
			@Getter @Setter private Start start = new Start();

		}
		@Getter @Setter private Offpeak offpeak = new Offpeak();

		public static class Procedure {
			public static class Master {
				@Getter @Setter  private String classes;

			}
			@Getter @Setter private Master master = new Master();

			public static class Regionserver {
				@Getter @Setter  private String classes;

			}
			@Getter @Setter private Regionserver regionserver = new Regionserver();

		}
		@Getter @Setter private Procedure procedure = new Procedure();

		public static class Region {
			public static class Replica {
				public static class Replication {
					@Getter @Setter  private String enabled;

				}
				@Getter @Setter private Replication replication = new Replication();

			}
			@Getter @Setter private Replica replica = new Replica();

		}
		@Getter @Setter private Region region = new Region();

		public static class Regions {
			@Getter @Setter  private String slop;

		}
		@Getter @Setter private Regions regions = new Regions();

		public static class Regionserver {
			public static class Checksum {
				@Getter @Setter  private String verify;

			}
			@Getter @Setter private Checksum checksum = new Checksum();

			public static class Dns {
				//Reserved word - original name interface
				@Getter @Setter  private String _interface;

				@Getter @Setter  private String nameserver;

			}
			@Getter @Setter private Dns dns = new Dns();

			public static class Global {
				public static class Memstore {
					public static class Size {
						public static class Lower {
							@Getter @Setter  private String limit;

						}
						@Getter @Setter private Lower lower = new Lower();

					}
					@Getter @Setter private Size size = new Size();

				}
				@Getter @Setter private Memstore memstore = new Memstore();

			}
			@Getter @Setter private Global global = new Global();

			public static class Handler {
				public static class Abort {
					public static class On {
						public static class Error {
							@Getter @Setter  private String percent;

						}
						@Getter @Setter private Error error = new Error();

					}
					@Getter @Setter private On on = new On();

				}
				@Getter @Setter private Abort abort = new Abort();

				@Getter @Setter  private String count;

			}
			@Getter @Setter private Handler handler = new Handler();

			public static class Hlog {
				public static class Reader {
					@Getter @Setter  private String impl;

				}
				@Getter @Setter private Reader reader = new Reader();

				public static class Writer {
					@Getter @Setter  private String impl;

				}
				@Getter @Setter private Writer writer = new Writer();

			}
			@Getter @Setter private Hlog hlog = new Hlog();

			@Getter @Setter  private String hostname;

			public static class Info {
				@Getter @Setter  private String bindAddress;

				public static class Port {
					@Getter @Setter  private Boolean auto;

				}
				@Getter @Setter private Port port = new Port();

			}
			@Getter @Setter private Info info = new Info();

			public static class Kerberos {
				@Getter @Setter  private String principal;

			}
			@Getter @Setter private Kerberos kerberos = new Kerberos();

			public static class Keytab {
				@Getter @Setter  private String file;

			}
			@Getter @Setter private Keytab keytab = new Keytab();

			public static class Logroll {
				public static class Errors {
					@Getter @Setter  private Integer tolerated;

				}
				@Getter @Setter private Errors errors = new Errors();

				@Getter @Setter  private Long period;

			}
			@Getter @Setter private Logroll logroll = new Logroll();

			public static class Majorcompaction {
				public static class Pagecache {
					@Getter @Setter  private String drop;

				}
				@Getter @Setter private Pagecache pagecache = new Pagecache();

			}
			@Getter @Setter private Majorcompaction majorcompaction = new Majorcompaction();

			public static class Minorcompaction {
				public static class Pagecache {
					@Getter @Setter  private String drop;

				}
				@Getter @Setter private Pagecache pagecache = new Pagecache();

			}
			@Getter @Setter private Minorcompaction minorcompaction = new Minorcompaction();

			@Getter @Setter  private Long msginterval;

			@Getter @Setter  private String optionalcacheflushinterval;

			@Getter @Setter  private Integer port;

			public static class Region {
				public static class Split {
					@Getter @Setter  private String policy;

				}
				@Getter @Setter private Split split = new Split();

			}
			@Getter @Setter private Region region = new Region();

			@Getter @Setter  private String regionSplitLimit;

			public static class Storefile {
				public static class Refresh {
					@Getter @Setter  private Long period;

				}
				@Getter @Setter private Refresh refresh = new Refresh();

			}
			@Getter @Setter private Storefile storefile = new Storefile();

			public static class Thread {
				public static class Compaction {
					@Getter @Setter  private String throttle;

				}
				@Getter @Setter private Compaction compaction = new Compaction();

			}
			@Getter @Setter private Thread thread = new Thread();

			public static class Thrift {
				@Getter @Setter  private String compact;

				public static class Framed {
					@Getter @Setter  private String max_frame_size_in_mb;

				}
				@Getter @Setter private Framed framed = new Framed();

			}
			@Getter @Setter private Thrift thrift = new Thrift();

		}
		@Getter @Setter private Regionserver regionserver = new Regionserver();

		public static class Replication {
			public static class Rpc {
				@Getter @Setter  private String codec;

			}
			@Getter @Setter private Rpc rpc = new Rpc();

			public static class Source {
				@Getter @Setter  private String maxthreads;

			}
			@Getter @Setter private Source source = new Source();

		}
		@Getter @Setter private Replication replication = new Replication();

		public static class Rest {
			public static class Csrf {
				@Getter @Setter  private String enabled;

			}
			@Getter @Setter private Csrf csrf = new Csrf();

			public static class Filter {
				@Getter @Setter  private String classes;

			}
			@Getter @Setter private Filter filter = new Filter();

			@Getter @Setter  private Integer port;

			@Getter @Setter  private String readonly;

			public static class Support {
				@Getter @Setter  private String proxyuser;

			}
			@Getter @Setter private Support support = new Support();

			public static class Threads {
				@Getter @Setter  private String max;

				@Getter @Setter  private String min;

			}
			@Getter @Setter private Threads threads = new Threads();

		}
		@Getter @Setter private Rest rest = new Rest();

		public static class RestCsrf {
			//Invalid name - original name browser-useragents-regex;
			@Getter @Setter  private String browserUseragentsRegex;

		}
		//Reserved word - original name rest-csrf
		@Getter @Setter private RestCsrf restCsrf = new RestCsrf();

		public static class Rootdir {
			@Getter @Setter  private String perms;

		}
		@Getter @Setter private Rootdir rootdir = new Rootdir();

		public static class Rpc {
			public static class Shortoperation {
				@Getter @Setter  private String timeout;

			}
			@Getter @Setter private Shortoperation shortoperation = new Shortoperation();

			@Getter @Setter  private String timeout;

		}
		@Getter @Setter private Rpc rpc = new Rpc();

		public static class Rs {
			@Getter @Setter  private String cacheblocksonwrite;

		}
		@Getter @Setter private Rs rs = new Rs();

		public static class Security {
			@Getter @Setter  private String authentication;

			public static class Exec {
				public static class Permission {
					@Getter @Setter  private String checks;

				}
				@Getter @Setter private Permission permission = new Permission();

			}
			@Getter @Setter private Exec exec = new Exec();

			public static class Visibility {
				public static class Mutations {
					@Getter @Setter  private String checkauths;

				}
				@Getter @Setter private Mutations mutations = new Mutations();

			}
			@Getter @Setter private Visibility visibility = new Visibility();

		}
		@Getter @Setter private Security security = new Security();

		public static class Serial {
			public static class Replication {
				@Getter @Setter  private String waitingMs;

			}
			@Getter @Setter private Replication replication = new Replication();

		}
		@Getter @Setter private Serial serial = new Serial();

		public static class Server {
			public static class Compactchecker {
				public static class Interval {
					@Getter @Setter  private String multiplier;

				}
				@Getter @Setter private Interval interval = new Interval();

			}
			@Getter @Setter private Compactchecker compactchecker = new Compactchecker();

			public static class Keyvalue {
				@Getter @Setter  private String maxsize;

			}
			@Getter @Setter private Keyvalue keyvalue = new Keyvalue();

			public static class Scanner {
				public static class Max {
					public static class Result {
						@Getter @Setter  private String size;

					}
					@Getter @Setter private Result result = new Result();

				}
				@Getter @Setter private Max max = new Max();

			}
			@Getter @Setter private Scanner scanner = new Scanner();

			public static class Thread {
				@Getter @Setter  private String wakefrequency;

			}
			@Getter @Setter private Thread thread = new Thread();

			public static class Versionfile {
				@Getter @Setter  private String writeattempts;

			}
			@Getter @Setter private Versionfile versionfile = new Versionfile();

		}
		@Getter @Setter private Server server = new Server();

		public static class Snapshot {
			@Getter @Setter  private String enabled;

			public static class Master {
				public static class Timeout {
					@Getter @Setter  private String millis;

				}
				@Getter @Setter private Timeout timeout = new Timeout();

			}
			@Getter @Setter private Master master = new Master();

			public static class Region {
				@Getter @Setter  private String timeout;

			}
			@Getter @Setter private Region region = new Region();

			public static class Restore {
				public static class Failsafe {
					@Getter @Setter  private String name;

				}
				@Getter @Setter private Failsafe failsafe = new Failsafe();

				public static class Take {
					public static class Failsafe {
						@Getter @Setter  private String snapshot;

					}
					@Getter @Setter private Failsafe failsafe = new Failsafe();

				}
				@Getter @Setter private Take take = new Take();

			}
			@Getter @Setter private Restore restore = new Restore();

		}
		@Getter @Setter private Snapshot snapshot = new Snapshot();

		public static class Status {
			public static class Listener {
				//Reserved name - original name class;
				@Getter @Setter  private String _class;

			}
			@Getter @Setter private Listener listener = new Listener();

			public static class Multicast {
				public static class Address {
					@Getter @Setter  private String ip;

					@Getter @Setter  private Integer port;

				}
				@Getter @Setter private Address address = new Address();

			}
			@Getter @Setter private Multicast multicast = new Multicast();

			@Getter @Setter  private String published;

			public static class Publisher {
				//Reserved name - original name class;
				@Getter @Setter  private String _class;

			}
			@Getter @Setter private Publisher publisher = new Publisher();

		}
		@Getter @Setter private Status status = new Status();

		public static class Storescanner {
			public static class Parallel {
				public static class Seek {
					@Getter @Setter  private String enable;

					@Getter @Setter  private String threads;

				}
				@Getter @Setter private Seek seek = new Seek();

			}
			@Getter @Setter private Parallel parallel = new Parallel();

		}
		@Getter @Setter private Storescanner storescanner = new Storescanner();

		@Getter @Setter  private String superuser;

		public static class Table {
			public static class Lock {
				@Getter @Setter  private String enable;

			}
			@Getter @Setter private Lock lock = new Lock();

			public static class Max {
				@Getter @Setter  private String rowsize;

			}
			@Getter @Setter private Max max = new Max();

		}
		@Getter @Setter private Table table = new Table();

		public static class Thrift {
			@Getter @Setter  private String maxQueuedRequests;

			@Getter @Setter  private String maxWorkerThreads;

			@Getter @Setter  private String minWorkerThreads;

		}
		@Getter @Setter private Thrift thrift = new Thrift();

		public static class Tmp {
			@Getter @Setter  private String dir;

		}
		@Getter @Setter private Tmp tmp = new Tmp();

		public static class Wal {
			public static class Dir {
				@Getter @Setter  private String perms;

			}
			@Getter @Setter private Dir dir = new Dir();

		}
		@Getter @Setter private Wal wal = new Wal();

		public static class Zookeeper {
			public static class Dns {
				//Reserved word - original name interface
				@Getter @Setter  private String _interface;

				@Getter @Setter  private String nameserver;

			}
			@Getter @Setter private Dns dns = new Dns();

			@Getter @Setter  private String leaderport;

			@Getter @Setter  private String peerport;

			public static class Property {
				@Getter @Setter  private String clientPort;

				@Getter @Setter  private String dataDir;

				@Getter @Setter  private String initLimit;

				@Getter @Setter  private String maxClientCnxns;

				@Getter @Setter  private String syncLimit;

			}
			@Getter @Setter private Property property = new Property();

			@Getter @Setter  private String quorum;

		}
		@Getter @Setter private Zookeeper zookeeper = new Zookeeper();

	}
	@Getter @Setter private Hbase hbase = new Hbase();

	public static class Hfile {
		public static class Block {
			public static class Bloom {
				@Getter @Setter  private String cacheonwrite;

			}
			@Getter @Setter private Bloom bloom = new Bloom();

			public static class Cache {
				@Getter @Setter  private String size;

			}
			@Getter @Setter private Cache cache = new Cache();

			public static class Index {
				@Getter @Setter  private String cacheonwrite;

			}
			@Getter @Setter private Index index = new Index();

		}
		@Getter @Setter private Block block = new Block();

		public static class Format {
			@Getter @Setter  private String version;

		}
		@Getter @Setter private Format format = new Format();

		public static class Index {
			public static class Block {
				public static class Max {
					@Getter @Setter  private String size;

				}
				@Getter @Setter private Max max = new Max();

			}
			@Getter @Setter private Block block = new Block();

		}
		@Getter @Setter private Index index = new Index();

	}
	@Getter @Setter private Hfile hfile = new Hfile();

	public static class Io {
		public static class Storefile {
			public static class Bloom {
				public static class Block {
					@Getter @Setter  private String size;

				}
				@Getter @Setter private Block block = new Block();

			}
			@Getter @Setter private Bloom bloom = new Bloom();

		}
		@Getter @Setter private Storefile storefile = new Storefile();

	}
	@Getter @Setter private Io io = new Io();

	public static class Zookeeper {
		public static class Recovery {
			public static class Retry {
				@Getter @Setter  private Long maxsleeptime;

			}
			@Getter @Setter private Retry retry = new Retry();

		}
		@Getter @Setter private Recovery recovery = new Recovery();

		public static class Session {
			@Getter @Setter  private String timeout;

		}
		@Getter @Setter private Session session = new Session();

		public static class Znode {
			public static class Acl {
				@Getter @Setter  private String parent;

			}
			@Getter @Setter private Acl acl = new Acl();

			@Getter @Setter  private String parent;

		}
		@Getter @Setter private Znode znode = new Znode();

	}
	@Getter @Setter private Zookeeper zookeeper = new Zookeeper();

	
}
