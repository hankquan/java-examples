package com.github.howaric.java17.java12.jmh_generated;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public class T1_TestJMH2_jmhType_B2 extends T1_TestJMH2_jmhType_B1 {
    public volatile int setupTrialMutex;
    public volatile int tearTrialMutex;
    public final static AtomicIntegerFieldUpdater<T1_TestJMH2_jmhType_B2> setupTrialMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(T1_TestJMH2_jmhType_B2.class, "setupTrialMutex");
    public final static AtomicIntegerFieldUpdater<T1_TestJMH2_jmhType_B2> tearTrialMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(T1_TestJMH2_jmhType_B2.class, "tearTrialMutex");

    public volatile int setupIterationMutex;
    public volatile int tearIterationMutex;
    public final static AtomicIntegerFieldUpdater<T1_TestJMH2_jmhType_B2> setupIterationMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(T1_TestJMH2_jmhType_B2.class, "setupIterationMutex");
    public final static AtomicIntegerFieldUpdater<T1_TestJMH2_jmhType_B2> tearIterationMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(T1_TestJMH2_jmhType_B2.class, "tearIterationMutex");

    public volatile int setupInvocationMutex;
    public volatile int tearInvocationMutex;
    public final static AtomicIntegerFieldUpdater<T1_TestJMH2_jmhType_B2> setupInvocationMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(T1_TestJMH2_jmhType_B2.class, "setupInvocationMutex");
    public final static AtomicIntegerFieldUpdater<T1_TestJMH2_jmhType_B2> tearInvocationMutexUpdater = AtomicIntegerFieldUpdater.newUpdater(T1_TestJMH2_jmhType_B2.class, "tearInvocationMutex");

}
