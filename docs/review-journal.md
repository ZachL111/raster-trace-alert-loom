# Review Journal

The review surface for `raster-trace-alert-loom` is deliberately narrow: one fixture, one scoring rule, and one local check.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its observability focus without claiming live deployment or external usage.

## Cases

- `baseline`: `span volume`, score 227, lane `ship`
- `stress`: `latency skew`, score 251, lane `ship`
- `edge`: `signal loss`, score 152, lane `ship`
- `recovery`: `incident shape`, score 202, lane `ship`
- `stale`: `span volume`, score 213, lane `ship`

## Note

The useful failure mode here is a wrong decision on a named case, not a vague style disagreement.
