# Raster Trace Alert Loom Walkthrough

This note is the quickest way to read the extra review model in `raster-trace-alert-loom`.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | span volume | 227 | ship |
| stress | latency skew | 251 | ship |
| edge | signal loss | 152 | ship |
| recovery | incident shape | 202 | ship |
| stale | span volume | 213 | ship |

Start with `stress` and `edge`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

The useful comparison is `latency skew` against `signal loss`, not the raw score alone.
