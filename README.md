# kaocha-either

Show error on kaocha when using `cats.monad.either/right` on a assertion

## Usage
```
$ clj -A:test
[(F)]
Randomized with --seed 511057240

FAIL in demo.kaocha-either-test/monad-either-fail-example (kaocha_either_test.clj:6)
ERROR: Error in reporter: class java.lang.ClassCastException when processing :summary
java.lang.ClassCastException: cats.monad.either.Right cannot be cast to clojure.lang.IFn
 at lambdaisland.deep_diff.diff$diff_map$fn__6133.invoke (diff.clj:116)
    ...
    lambdaisland.deep_diff.diff$diff_map.invokeStatic (diff.clj:112)
    lambdaisland.deep_diff.diff$diff_map.invoke (diff.clj:106)
    lambdaisland.deep_diff.diff$eval6156$fn__6157.invoke (diff.clj:162)
    lambdaisland.deep_diff.diff$eval6034$fn__6035$G__6025__6042.invoke (diff.clj:11)
    lambdaisland.deep_diff.diff$diff.invokeStatic (diff.clj:136)
    lambdaisland.deep_diff.diff$diff.invoke (diff.clj:134)
    lambdaisland.deep_diff$diff.invokeStatic (deep_diff.clj:20)
    lambdaisland.deep_diff$diff.invoke (deep_diff.clj:5)
    ...
    kaocha.report$eval2765$fn__2766$iter__2770__2774$fn__2775.invoke (report.clj:261)
    ...
    kaocha.report$eval2765$fn__2766.invoke (report.clj:258)
    ...
    kaocha.report$eval2796$fn__2798.invoke (report.clj:283)
    ...
    kaocha.report$eval2812$fn__2813$fn__2819.invoke (report.clj:308)
    kaocha.report$eval2812$fn__2813.invoke (report.clj:306)
    ...
    kaocha.config$resolve_reporter$fn__2999$fn__3000.invoke (config.clj:142)
    ...
    kaocha.config$resolve_reporter$fn__2999.invoke (config.clj:142)
    kaocha.config$resolve_reporter$fn__2999$fn__3000.invoke (config.clj:142)
    ...
    kaocha.config$resolve_reporter$fn__2999.invoke (config.clj:142)
    kaocha.api$resolve_reporter$fn__3087.invoke (api.clj:56)
    ...
    kaocha.api$run$fn__3091$fn__3092$fn__3093.invoke (api.clj:107)
    ...
    kaocha.api$run$fn__3091$fn__3092.invoke (api.clj:93)
    ...
    kaocha.api$run$fn__3091.invoke (api.clj:89)
    ...
    kaocha.api$run.invokeStatic (api.clj:83)
    kaocha.api$run.invoke (api.clj:71)
    kaocha.watch$try_run$fn__4849.invoke (watch.clj:49)
    kaocha.watch$try_run.invokeStatic (watch.clj:48)
    kaocha.watch$try_run.invoke (watch.clj:40)
    kaocha.watch$run_loop.invokeStatic (watch.clj:120)
    kaocha.watch$run_loop.invoke (watch.clj:114)
    kaocha.watch$run_STAR_.invokeStatic (watch.clj:214)
    kaocha.watch$run_STAR_.invoke (watch.clj:196)
    kaocha.watch$run$fn__4901.invoke (watch.clj:224)
    ...
    java.util.concurrent.FutureTask.run (FutureTask.java:266)
    java.util.concurrent.ThreadPoolExecutor.runWorker (ThreadPoolExecutor.java:1149)
    java.util.concurrent.ThreadPoolExecutor$Worker.run (ThreadPoolExecutor.java:624)
    ...
```

## License

Copyright © 2019 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
